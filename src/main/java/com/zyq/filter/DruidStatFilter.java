package com.zyq.filter;

/**
 * @ClassName: DruidStatFilter
 * @Description: TODO(druid过滤器)
 * @author 庄友权
 * @date 2016年8月25日 下午4:07:28
 * 
 */

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
 
import com.alibaba.druid.support.http.WebStatFilter;

@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",
    initParams={
            @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")//忽略资源
     }
)
public class DruidStatFilter extends WebStatFilter{
 
}
