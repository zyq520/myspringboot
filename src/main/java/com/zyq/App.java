package com.zyq;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import com.zyq.configurationproperties.GetPropertiesValues;
import com.zyq.filter.MyFilter;
import com.zyq.servlet.MyServlet;

/**
 * @ClassName: App
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月25日 上午11:30:05
 * 注解扫描自己需要加载的包
 * @ComponentScan(basePackages={"cn.xxx","org.xxxx"})
 */
@SpringBootApplication
@MapperScan("com.zyq.mapper")//mybatis文件扫面包
@EnableConfigurationProperties({GetPropertiesValues.class})//properties值读取
public class App {
    /**
     * 注册servlet
    * @Title: MyServlet 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @return    设定文件 
    * @return ServletRegistrationBean    返回类型 
    * @throws
     */
    @Bean
    public ServletRegistrationBean MyServlet(){
        return new ServletRegistrationBean(new MyServlet(),"/myservlet/");
    }
    /**
     * 注册过滤器
    * @Title: MyFilter 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @return    设定文件 
    * @return FilterRegistrationBean    返回类型 
    * @throws
     */
    @Bean
    public FilterRegistrationBean MyFilter(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());  
        filterRegistrationBean.setEnabled(true);  
        filterRegistrationBean.addUrlPatterns("/*"); 
        return filterRegistrationBean;
    }
    /**
     * 文件上传设置
    * @Title: main 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param args    设定文件 
    * @return void    返回类型 
    * @throws
     */
//    @Bean 
//    public MultipartConfigElement multipartConfigElement() { 
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//        //// 设置文件大小限制 ,超了，页面会抛出异常信息，这时候就需要进行异常信息的处理了;
//        factory.setMaxFileSize("128KB"); //KB,MB
//        /// 设置总上传数据总大小
//        factory.setMaxRequestSize("256KB"); 
//        //Sets the directory location where files will be stored.
//        //factory.setLocation("路径地址");
//        return factory.createMultipartConfig(); 
//    } 

    public static void main(String[] args) {
        //System.out.println("热部署");
        SpringApplication.run(App.class, args);
    }
}
