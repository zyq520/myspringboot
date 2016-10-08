package com.zyq.scheduling;

/**
 * @ClassName: SchedulingConfig
 * @Description: TODO(spring boot 定时任务)
 * @author 庄友权
 * @date 2016年8月25日 下午3:54:30
 * 
 */

import java.util.Date;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;



@Configuration
@EnableScheduling
public class SchedulingConfig {
    @Autowired  
    JavaMailSender mailSender;
    @Scheduled(cron = "0/60 * * * * ?") // 每20秒执行一次
    public void scheduler() {
        System.out.println(new Date()+">>>>>>>>> 定时任务每隔60秒执行一次");
        try  
        {   
            String flag=DataUtil.sendPost("http://crystal.idx365.com/");
            if("".equals(flag)){
                final MimeMessage mimeMessage = this.mailSender.createMimeMessage();  
                final MimeMessageHelper message = new MimeMessageHelper(mimeMessage);  
                message.setFrom("qq125396467@163.com");// 发送者
                message.setTo("125396467@qq.com");// 接收者.
                message.setSubject("浦江水晶挂了");// 邮件主题.
                message.setText("浦江水晶挂了");// 邮件内容.
                this.mailSender.send(mimeMessage);
                System.out.println("浦江水晶挂了");
            }
        }  
        catch(Exception ex)  
        {  
            System.out.println("发送邮件失败");
        }  
    }
}
