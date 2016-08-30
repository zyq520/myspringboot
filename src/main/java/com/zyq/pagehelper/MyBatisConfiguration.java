/**   
* @Title: MyBatisConfiguration.java
* @Package com.zyq.pagehelper
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月30日 下午3:10:13
* @version V1.0   
*/


package com.zyq.pagehelper;

/**
 * @ClassName: MyBatisConfiguration
 * @Description: TODO(这里用一句话描述这个类的作用)
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
