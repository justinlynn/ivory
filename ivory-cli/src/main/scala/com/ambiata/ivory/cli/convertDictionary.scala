package com.ambiata.ivory.cli

import com.ambiata.ivory.core._
import com.ambiata.ivory.storage.metadata._
import com.ambiata.ivory.storage.control._
import scalaz.effect.IO

object convertDictionary extends IvoryApp {

  case class CliArguments(input: String, output: String)

  val parser = new scopt.OptionParser[CliArguments]("convert-dictionary") {
    head("Convert a dictionary from the old format to the latest and output the contents to a specified file")
    help("help") text "shows this usage text"
    opt[String]('i', "input") action { (x, c) => c.copy(input = x)  }  required() text "Dictionary file to convert"
    opt[String]('o', "output") action { (x, c) => c.copy(output = x) } required() text "File to output new dictionary to"
  }

  val cmd = new IvoryCmd[CliArguments](parser, CliArguments("", ""), IvoryRunner { conf => {
    case CliArguments(input, output) =>
      IvoryT.fromRIO { for {
        in         <- IvoryLocation.fromUri(input, conf)
        out        <- IvoryLocation.fromUri(output, conf)
        dictionary <- DictionaryTextStorage.dictionaryFromIvoryLocation(in)
        _          <- IvoryLocation.writeUtf8(out, DictionaryTextStorageV2.delimitedString(dictionary))
      } yield List(s"File successfully written to $output") }
  }})
}
