package com.stitch.web.springweb.controller;

import com.stitch.commons.utils.Result;
import com.stitch.commons.utils.ResultGenerator;
import com.stitch.service.test.OutTestServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author:Stitch Chen
 * @create: 2023-09-17 17:33
 * @Description: 测试web层
 */
@RestController
public class TestController {

    private  static final Logger log= LoggerFactory.getLogger(TestController.class);

    @Autowired
    private OutTestServer outTestServer;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/getMes")
    public Result outMes(){
        outTestServer.outmessage();
        log.info("打印日志。");
        String name = jdbcTemplate.queryForObject("SELECT name FROM t_user WHERE username = ?", String.class, "admin");//jdbcDao.queryForObject("SELECT name FROM t_user WHERE username = ?", String.class, "admin");
        System.out.println("Name: " + name);
        Result resultGenerator=ResultGenerator.genSuccessResult("请求成功!");
        return resultGenerator;
    }
}
