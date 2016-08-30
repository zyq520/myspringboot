/**   
* @Title: DemoService.java
* @Package com.zyq.service
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月30日 下午2:48:16
* @version V1.0   
*/


package com.zyq.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.zyq.model.Demo;

/**
 * @ClassName: DemoService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月30日 下午2:48:16
 * 
 */

public interface DemoService {
    public List<Demo> likeName(String name);
   
    public Demo getById(long id);
   
    public String getNameById(long id);
}
