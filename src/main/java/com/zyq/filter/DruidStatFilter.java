/**   
* @Title: DruidStatFilter.java
* @Package com.zyq.filter
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月25日 下午4:07:28
* @version V1.0   
*/


package com.zyq.filter;

/**
 * @ClassName: DruidStatFilter
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月25日 下午4:07:28
 * 
 */

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
 
import com.alibaba.druid.support.http.WebStatFilter;
 
/**
 * druid过滤器.
 * @author Administrator
 *
 */
@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",
    initParams={
            @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")//忽略资源
     }
)
public class DruidStatFilter extends WebStatFilter{
 
}
