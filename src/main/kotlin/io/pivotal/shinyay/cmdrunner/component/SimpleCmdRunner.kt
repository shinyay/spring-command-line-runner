package io.pivotal.shinyay.cmdrunner.component

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class SimpleCmdRunner: CommandLineRunner {
    val logger: Logger = LoggerFactory.getLogger(this.javaClass)

    override fun run(vararg args: String?) {
        logger.info("Executing the command line runner, Application arguments: ${args.contentToString()}")
    }
}