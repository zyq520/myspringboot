package com.zyq.configurationproperties;

/**
 * @ClassName: ConfigurationProperties
 * @Description: TODO(spring preoperties值读取实体类)
 * @author 庄友权
 * @date 2016年8月31日 上午10:09:52
 */

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix="com.zyq.spring")
public class GetPropertiesValues {
    private String name;//博客作者
    
    private String title;//博客标题

    /** 
     * @return name 
     */
    
    public String getName() {
        return name;
    }

    /** 
     * @param name 要设置的 name 
     */
    
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * @return title 
     */
    
    public String getTitle() {
        return title;
    }

    /** 
     * @param title 要设置的 title 
     */
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    
}
