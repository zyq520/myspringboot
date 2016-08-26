/**   
* @Title: MyStartupRunner.java
* @Package com.zyq.startuprunner
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月26日 下午1:18:15
* @version V1.0   
*/


package com.zyq.startuprunner;

/**
 * @ClassName: MyStartupRunner
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月26日 下午1:18:15
 * 
 */

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
 
/**
 * 服务启动执行
 *
 * @author   Angel(QQ:412887952)
 */
@Component
@Order(value=1)
public class MyStartupRunner implements CommandLineRunner {
 
    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 11111111 <<<<<<<<<<<<<");
    }
 
}
