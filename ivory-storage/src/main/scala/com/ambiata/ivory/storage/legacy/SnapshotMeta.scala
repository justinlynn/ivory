package com.ambiata.ivory.storage.legacy

import com.ambiata.ivory.core._
import com.ambiata.ivory.data.{IdentifierStorage, StoreDataUtil}
//import com.ambiata.ivory.storage.fact.FeatureStoreGlob
import com.ambiata.ivory.storage.metadata._

import com.ambiata.mundane.control._
import com.ambiata.mundane.io._
import com.ambiata.mundane.parse.ListParser

import scalaz._, \&/._, effect.IO

// FIX MTH remove

object SnapshotMeta {

  val fname = FilePath(".snapmeta")

  def fromReference(ref: ReferenceIO): ResultTIO[SnapshotMetadata] = for {
    lines      <- ref.run(store => store.linesUtf8.read)
    snapshotId <- ResultT.fromOption[IO, SnapshotId](SnapshotId.parse(ref.path.dirname.basename.path), s"can't parse ${ref.path.basename.path} as a snapshot id")
    sm         <- ResultT.fromDisjunction[IO, SnapshotMetadata](parser(snapshotId).run(lines).disjunction.leftMap(This.apply))
  } yield sm

  def fromIdentifier(repo: Repository, id: SnapshotId): ResultTIO[SnapshotMetadata] =
    fromReference(repo.toReference(Repository.snapshots </> FilePath(id.render) </> fname))

  /**
   * Parse a snapshot meta file for a given snapshot id
   */
  def parser(snapshotId: SnapshotId): ListParser[SnapshotMetadata] = {
    import ListParser._
    for {
      date    <- localDate
      storeId <- FeatureStoreId.listParser
    } yield SnapshotMetadata(snapshotId, Date.fromLocalDate(date), storeId)
  }

  /**
   * create a new Snapshot id by create a new .allocated sub-directory
   * with the latest available identifier + 1
   */
  def allocateId(repository: Repository): ResultTIO[SnapshotId] = for {
    res <- IdentifierStorage.write(FilePath(".allocated"), scodec.bits.ByteVector.empty)(repository.toStore, Repository.snapshots)
  } yield SnapshotId(res._1)

  /**
   * create a new Snapshot meta object by allocating a new snapshot id
   */
  def createSnapshotMetadata(repository: Repository, date: Date): ResultTIO[SnapshotMetadata] = for {
    storeId     <- Metadata.latestFeatureStoreIdOrFail(repository)
    snapshotId  <- allocateId(repository)
  } yield SnapshotMetadata(snapshotId, date, storeId)

  /**
   * Get the latest snapshot which is just before a given date
   * and return it if it is up to date. The latest snapshot is up to date if
   *
   *  latestSnapshot.featureStore == latestFeatureStore
   *     and the snapshot.date == date
   *
   *     OR the snapshot.date <= date
   *        but there are no partitions between the snapshot date and date for factsets in the latest feature store
   */
/*  def latestUpToDateSnapshot(repository: Repository, date: Date): ResultTIO[Option[SnapshotMetadata]] = {
    latestSnapshot(repository, date).flatMap(_.traverseU { meta: SnapshotMetadata =>

      Metadata.latestFeatureStoreOrFail(repository).flatMap { featureStore =>
        if (meta.storeId == featureStore.id) {

          if (meta.date == date) ResultT.ok[IO, Option[SnapshotMetadata]](Some(meta))
          else
            FeatureStoreGlob.between(repository, featureStore, meta.date, date).map { glob =>
              if (glob.partitions.isEmpty) Some(meta)
              else                         None
            }
        } else ResultT.ok[IO, Option[SnapshotMetadata]](None)
      }
    }).map(_.flatten)
  }
*/
//  def latestWithStoreId(repository: Repository, date: Date, featureStoreId: FeatureStoreId): ResultTIO[Option[SnapshotMetadata]] =
//    latestSnapshot(repository, date).map(_.filter(_.storeId == featureStoreId))

  /**
   * get the latest snapshot which is just before a given date
   *
   * If there are 2 snapshots at the same date:
   *
   *   - take the snapshot having the greatest store id
   *   - if this results in 2 snapshots having the same store id, take the one having the greatest snapshot id
   *
   * This is implemented by defining an order on snapshots where we order based on the triple of
   *  (snapshotId, featureStoreId, date)
   *
   */
/*  def latestSnapshot(repository: Repository, date: Date): ResultTIO[Option[SnapshotMetadata]] = for {
    ids      <- repository.toReference(Repository.snapshots).run(s => p => StoreDataUtil.listDir(s, p)).map(_.map(_.basename.path))
    metas    <- ids.traverseU(sid => SnapshotId.parse(sid).map(id => fromIdentifier(repository, id)).sequenceU)
    filtered =  metas.flatten.filter(_.date isBeforeOrEqual date)
  } yield filtered.sorted.lastOption */
}
