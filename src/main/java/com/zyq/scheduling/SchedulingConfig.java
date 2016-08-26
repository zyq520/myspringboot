/**   
* @Title: SchedulingConfig.java
* @Package com.zyq.scheduling
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月25日 下午3:54:30
* @version V1.0   
*/


package com.zyq.scheduling;

import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @ClassName: SchedulingConfig
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月25日 下午3:54:30
 * 
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {
    
    @Scheduled(cron = "0/20 * * * * ?") // 每20秒执行一次
    public void scheduler() {
        System.out.println(new Date()+">>>>>>>>> 定时任务每隔20秒执行一次");
    }
}
