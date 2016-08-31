package com.zyq.scheduling;

/**
 * @ClassName: SchedulingConfig
 * @Description: TODO(spring boot 定时任务)
 * @author 庄友权
 * @date 2016年8月25日 下午3:54:30
 * 
 */

import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


@Configuration
@EnableScheduling
public class SchedulingConfig {
    
    @Scheduled(cron = "0/20 * * * * ?") // 每20秒执行一次
    public void scheduler() {
        System.out.println(new Date()+">>>>>>>>> 定时任务每隔20秒执行一次");
    }
}
