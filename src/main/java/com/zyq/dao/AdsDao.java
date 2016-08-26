/**   
* @Title: AdsDao.java
* @Package com.zyq.dao
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月25日 下午3:35:41
* @version V1.0   
*/


package com.zyq.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zyq.model.Ads;

/**
 * @ClassName: AdsDao
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月25日 下午3:35:41
 * 
 */
@Repository
public class AdsDao {
    @Resource
    private JdbcTemplate jdbcTemplate;
    
    public Ads getById(int id){
        String sql = "select * from ads where id=?";
        RowMapper<Ads> rowMapper = new BeanPropertyRowMapper<Ads>(Ads.class);
        return jdbcTemplate.queryForObject(sql, rowMapper,id);
    }
}
