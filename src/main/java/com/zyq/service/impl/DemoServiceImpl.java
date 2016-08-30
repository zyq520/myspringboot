/**   
* @Title: DemoServiceImpl.java
* @Package com.zyq.service.impl
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月30日 下午2:48:42
* @version V1.0   
*/


package com.zyq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyq.mapper.DemoMappper;
import com.zyq.model.Demo;
import com.zyq.service.DemoService;

/**
 * @ClassName: DemoServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月30日 下午2:48:42
 * 
 */
@Service
public class DemoServiceImpl implements DemoService{
    @Autowired
    private DemoMappper demoMapper;
    /* (非 Javadoc) 
    * <p>Title: likeName</p> 
    * <p>Description: </p> 
    * @param name
    * @return 
    * @see com.zyq.service.DemoService#likeName(java.lang.String) 
    */ 
    
    
    @Override
    public List<Demo> likeName(String name) {
        // TODO Auto-generated method stub
        return demoMapper.likeName(name);
    }

    /* (非 Javadoc) 
    * <p>Title: getById</p> 
    * <p>Description: </p> 
    * @param id
    * @return 
    * @see com.zyq.service.DemoService#getById(long) 
    */ 
    
    
    @Override
    public Demo getById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (非 Javadoc) 
    * <p>Title: getNameById</p> 
    * <p>Description: </p> 
    * @param id
    * @return 
    * @see com.zyq.service.DemoService#getNameById(long) 
    */ 
    
    
    @Override
    public String getNameById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

}
