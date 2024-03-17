package com.stitch.commons.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author:Stitch Chen
 * @create: 2023-10-15 10:18
 * @Description:
 */
@Component
public class TestDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void performDatabaseOperations() {
        try {
            // 查询单个数据
            String name = jdbcTemplate.queryForObject("SELECT name FROM t_user WHERE username = ?", String.class, "admin");//jdbcDao.queryForObject("SELECT name FROM t_user WHERE username = ?", String.class, "admin");
            System.out.println("dao Name: " + name);
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
