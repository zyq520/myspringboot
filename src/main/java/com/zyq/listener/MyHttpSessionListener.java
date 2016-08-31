package com.zyq.listener;

/**
 * @ClassName: MyHttpSessionListener
 * @Description: TODO(Session监听器)
 * @author 庄友权
 * @date 2016年8月26日 上午11:23:03
 * 
 */

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;



public class MyHttpSessionListener implements HttpSessionListener {
    
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session 被创建");
    }
 
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("ServletContex初始化");
    }
 
}
