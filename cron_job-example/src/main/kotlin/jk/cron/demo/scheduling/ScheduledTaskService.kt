package jk.cron.demo.scheduling

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import java.time.LocalDateTime

/**
 * @author Junaid Khan
 *
 */

@Service
class ScheduledTaskService {


    @Scheduled(cron = "*/10 * * * * *")
    fun performTask(){
        println("Scheduled task executed at: ${LocalDateTime.now()}")
    }
}
