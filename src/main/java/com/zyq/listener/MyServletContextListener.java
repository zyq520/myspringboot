package com.zyq.listener;

/**
 * @ClassName: MyServletContextListener
 * @Description: TODO(自定义监听器)
 * @author 庄友权
 * @date 2016年8月26日 上午11:21:50
 * 
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;



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
