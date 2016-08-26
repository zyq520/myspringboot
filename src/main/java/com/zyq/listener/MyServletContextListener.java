/**   
* @Title: MyServletContextListener.java
* @Package com.zyq.listener
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月26日 上午11:21:49
* @version V1.0   
*/


package com.zyq.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @ClassName: MyServletContextListener
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月26日 上午11:21:50
 * 
 */

public class MyServletContextListener implements ServletContextListener{

    /* (非 Javadoc) 
    * <p>Title: contextDestroyed</p> 
    * <p>Description: </p> 
    * @param arg0 
    * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent) 
    */ 
    
    
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("ServletContex销毁");
    }

    /* (非 Javadoc) 
    * <p>Title: contextInitialized</p> 
    * <p>Description: </p> 
    * @param arg0 
    * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent) 
    */ 
    
    
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("ServletContex初始化");
    }

}
