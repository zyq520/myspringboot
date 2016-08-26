/**   
* @Title: MyHttpSessionListener.java
* @Package com.zyq.listener
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月26日 上午11:23:03
* @version V1.0   
*/


package com.zyq.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @ClassName: MyHttpSessionListener
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月26日 上午11:23:03
 * 
 */

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
