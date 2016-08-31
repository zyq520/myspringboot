package com.zyq.startuprunner;

/**
 * @ClassName: MyStartupRunner
 * @Description: TODO(服务启动执行)
 * @author 庄友权
 * @date 2016年8月26日 下午1:18:15
 * 
 */

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
 
@Component
@Order(value=1)
public class MyStartupRunner implements CommandLineRunner {
 
    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 11111111 <<<<<<<<<<<<<");
    }
 
}
