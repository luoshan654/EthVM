package com.ethvm.processing.cmd

import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.long
import mu.KotlinLogging
import java.math.BigInteger
import kotlin.system.exitProcess

class Rewind : AbstractCliktCommand(help = "Rewind processors to a specified concrete block") {

  private val logger = KotlinLogging.logger {}

  private val blockNumber: Long? by option(
    "-b", "--block-number",
    help = "The block number we will rewind until. Be aware, this number is inclusive"
  ).long()

  override fun run() {

    inject()
    requireNotNull(blockNumber) { "blockNumber must be specified" }
    rewind((blockNumber ?: 0).toBigInteger(), processorsList)
  }

  private fun rewind(blockNumber: BigInteger, processorList: List<String>) {

    // instantiate
    logger.info { "Instantiating processors: $processorList" }
    val processors = instantiateProcessors(processorList)

    processors
      .forEach {
        it.initialise()
        it.rewindUntil(blockNumber)
      }

    exitProcess(0)
  }
}
