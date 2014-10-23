package com.ambiata.ivory.storage.task

import com.ambiata.ivory.lookup.ReducerLookup
import com.ambiata.ivory.storage.lookup.ReducerLookups
import com.ambiata.poacher.mr.MrContext
import org.apache.hadoop.conf.{Configuration, Configurable}
import org.apache.hadoop.io.{BytesWritable, LongWritable}
import org.apache.hadoop.mapreduce.Partitioner

/**
 * Partitioner for facts
 *
 * Keys are partitioned by the externalized feature id (held in the top 32 bits of the key)
 * into predetermined buckets. We use the predetermined buckets as upfront knowledge of
 * the input size is used to reduce skew on input data.
 */
class FactsPartitioner extends BaseFactsPartitioner[LongWritable] {
  def getFeatureId(k: LongWritable): Int =
    (k.get >>> 32).toInt
}

trait BaseFactsPartitioner[A] extends Partitioner[A, BytesWritable] with Configurable {
  var _conf: Configuration = null
  var ctx: MrContext = null
  val lookup = new ReducerLookup

  def setConf(conf: Configuration): Unit = {
    _conf = conf
    ctx = MrContext.fromConfiguration(_conf)
    ctx.thriftCache.pop(conf, ReducerLookups.Keys.ReducerLookup, lookup)
  }

  def getConf: Configuration =
    _conf

  def getPartition(k: A, v: BytesWritable, partitions: Int): Int =
    lookup.reducers.get(getFeatureId(k)) % partitions

  def getFeatureId(k: A): Int
}
