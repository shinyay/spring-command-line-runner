package io.pivotal.shinyay.cmdrunner

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CmdRunnerApplication

fun main(args: Array<String>) {
	runApplication<CmdRunnerApplication>(*args)
}
