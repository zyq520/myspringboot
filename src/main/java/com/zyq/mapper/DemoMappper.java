/**   
* @Title: DemoMappper.java
* @Package com.zyq.mapper
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月30日 下午2:47:25
* @version V1.0   
*/


package com.zyq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.zyq.model.Demo;

/**
 * @ClassName: DemoMappper
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月30日 下午2:47:25
 * 
 */

public interface DemoMappper {
    @Select("select * from demo")
    public List<Demo> likeName(String name);
    
    @Select("select * from demo where id = #{id}")
    public Demo getById(long id);
   
    @Select("select name from demo where id = #{id}")
    public String getNameById(long id);
}
