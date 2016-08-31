package com.zyq.dao;

/**
 * @ClassName: AdsDao
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月25日 下午3:35:41
 * 
 */

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zyq.model.Ads;


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
