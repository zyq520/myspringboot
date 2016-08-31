package com.zyq.email;

/**
 * @ClassName: email
 * @Description: TODO(发送邮件4种常见方法)
 * @author 庄友权
 * @date 2016年8月30日 下午3:57:12
 * 
 */

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.zyq.App;

import freemarker.template.Configuration;
import freemarker.template.Template;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
public class email {
    @Autowired
    private JavaMailSender mailSender;

    /**
     * 修改application.properties的用户，才能发送。
     */
    @Test
    public void sendSimpleEmail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("qq125396467@163.com");// 发送者
        message.setTo("2642126414@qq.com");// 接收者.
        message.setSubject("亲爱的宝宝启");// 邮件主题.
        message.setText("宝宝想你啦");// 邮件内容.
        mailSender.send(message);// 发送邮件
    }

    /**
     * 测试发送附件.(这里发送图片.)
     * 
     * @throws MessagingException
     */
    @Test
    public void sendAttachmentsEmail() throws MessagingException {
        // 这个是javax.mail.internet.MimeMessage下的，不要搞错了。
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        // 基本设置.
        helper.setFrom("qq125396467@163.com");// 发送者
        helper.setTo("2642126414@qq.com");// 接收者.
        helper.setSubject("测试附件（邮件主题）");// 邮件主题.
        helper.setText("这是邮件内容（有附件哦.）");// 邮件内容.
        // org.springframework.core.io.FileSystemResource下的:
        // 附件1,获取文件对象.
        FileSystemResource file1 = new FileSystemResource(new File(
                "D:/head1.jpg"));
        // 添加附件，这里第一个参数是在邮件中显示的名称，也可以直接是head.jpg，但是一定要有文件后缀，不然就无法显示图片了。
        helper.addAttachment("头像1.jpg", file1);
        // 附件2
        FileSystemResource file2 = new FileSystemResource(new File(
                "D:/head2.jpg"));
        helper.addAttachment("头像2.jpg", file2);
        mailSender.send(mimeMessage);
    }

    /**
     * 邮件中使用静态资源.
     * 
     * @throws Exception
     */
    @Test
    public void sendInlineMail() throws Exception {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        // 基本设置.
        helper.setFrom("qq125396467@163.com");// 发送者
        helper.setTo("2642126414@qq.com");// 接收者.
        helper.setSubject("测试静态资源（邮件主题）");// 邮件主题.
        // 邮件内容，第二个参数指定发送的是HTML格式
        // 说明：嵌入图片<img src='cid:head'/>，其中cid:是固定的写法，而aaa是一个contentId。
        helper.setText("<body>这是图片：<img src='cid:head' /></body>", true);
        FileSystemResource file = new FileSystemResource(new File(
                "D:/head1.jpg"));
        helper.addInline("head", file);
        mailSender.send(mimeMessage);
    }

    /**
     * 模板邮件；
     * 
     * @throws Exception
     */
    @Test
    public void sendTemplateMail() throws Exception {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        // 基本设置.
        helper.setFrom("qq125396467@163.com");// 发送者
        helper.setTo("2642126414@qq.com");// 接收者.
        helper.setSubject("模板邮件（邮件主题）");// 邮件主题.
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("username", "zyq");
        // Template template =
        // freeMarkerConfigurer.getConfiguration().getTemplate("email.ftl");//加载资源文件
        // 实际开发中这个定义一个bean进行使用，上一个代码就是定义为bean进行加入的，这里为了方便直接new使用。
        Configuration configurer = new Configuration(Configuration.VERSION_2_3_0);
        configurer.setClassForTemplateLoading(this.getClass(), "/templates");
        Template template = configurer.getTemplate("email.html");// 加载资源文件
        String html = FreeMarkerTemplateUtils.processTemplateIntoString(
                template, model);
        helper.setText(html, true);
        mailSender.send(mimeMessage);
    }
}
