package jk.cron.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class CronJobExampleApplication

fun main(args: Array<String>) {
	runApplication<CronJobExampleApplication>(*args)
}
