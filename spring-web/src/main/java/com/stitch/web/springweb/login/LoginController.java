package com.stitch.web.springweb.login;

import com.stitch.commons.utils.Result;
import com.stitch.commons.utils.ResultGenerator;
import com.stitch.service.login.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author:Stitch Chen
 * @create: 2023-10-15 16:17
 * @Description: 登录web
 */
@Controller
public class LoginController {

    private  static final Logger log= LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private LoginService loginService;

    @GetMapping("/getIndex")
    public String outMes(){
        return "redirect:/index.html";
    }

    @RequestMapping("/prelogin")
    public Result prelogin(){
        loginService.prelogin();
        Result resultGenerator= ResultGenerator.genSuccessResult("请求成功!");
        return resultGenerator;
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam(value = "username")String username,
                        @RequestParam(value = "password")String password){
        log.info("username:"+username+",password:"+password);

        return "redirect:/home.html";
    }

}
