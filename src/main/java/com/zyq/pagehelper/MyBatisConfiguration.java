package com.zyq.pagehelper;

/**
 * @ClassName: MyBatisConfiguration
 * @Description: TODO(MyBatis PageHelper分页)
 * @author 庄友权
 * @date 2016年8月30日 下午3:10:13
 * 
 */

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
import com.github.pagehelper.PageHelper;
 
@Configuration
public class MyBatisConfiguration {
   
    @Bean
    public PageHelper pageHelper() {
        System.out.println("MyBatisConfiguration.pageHelper()");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
   
}
