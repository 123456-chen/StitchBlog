package com.stitch.commons.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class JdbcDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 查询单个数据
    public <T> T queryForObject(String sql, Class<T> elementType, Object... args) {
        return jdbcTemplate.queryForObject(sql, elementType, args);
    }

    // 查询列表数据
    public <T> List<T> queryForList(String sql, Class<T> elementType, Object... args) {
        return jdbcTemplate.queryForList(sql, elementType, args);
    }

    // 执行更新操作（插入、更新、删除）
    public int update(String sql, Object... args) {
        return jdbcTemplate.update(sql, args);
    }

    // 执行存储过程
    /*public void executeStoredProcedure(String procedureName, Object... inParameters) {
        jdbcTemplate.execute("{call " + procedureName + "}", (callableStatementCallback) -> {
            // 设置存储过程的输入参数
            for (int i = 0; i < inParameters.length; i++) {
                callableStatementCallback.setObject(i + 1, inParameters[i]);
            }

            // 执行存储过程
            callableStatementCallback.execute();

            // 获取输出参数，如果有的话
            // callableStatementCallback.getObject(index);
            return null;
        });
    }*/
}
