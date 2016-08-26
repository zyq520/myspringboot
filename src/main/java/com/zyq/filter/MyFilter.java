/**   
* @Title: MyFilter.java
* @Package com.zyq.filter
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月26日 上午11:15:04
* @version V1.0   
*/


package com.zyq.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @ClassName: MyFilter
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月26日 上午11:15:04
 * 
 */

public class MyFilter implements Filter{

    /* (非 Javadoc) 
    * <p>Title: destroy</p> 
    * <p>Description: </p>  
    * @see javax.servlet.Filter#destroy() 
    */ 
    
    
    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        System.out.println("过滤器销毁");
    }

    /* (非 Javadoc) 
    * <p>Title: doFilter</p> 
    * <p>Description: </p> 
    * @param arg0
    * @param arg1
    * @param arg2
    * @throws IOException
    * @throws ServletException 
    * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain) 
    */ 
    
    
    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1,
            FilterChain arg2) throws IOException, ServletException {
        // TODO Auto-generated method stub
        System.out.println("执行过滤操作");
        arg2.doFilter(arg0, arg1);
    }

    /* (非 Javadoc) 
    * <p>Title: init</p> 
    * <p>Description: </p> 
    * @param arg0
    * @throws ServletException 
    * @see javax.servlet.Filter#init(javax.servlet.FilterConfig) 
    */ 
    
    
    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub
        System.out.println("过滤器初始化");
    }

}
