package com.zjedu.login.controller;

import com.zjedu.login.service.LoginService;
import com.zjedu.login.pojo.Result;
import com.zjedu.login.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Lay
 */
@Slf4j
@RestController
@RequestMapping("/login")
@Validated
public class LoginController
{

    @Resource
    private LoginService loginService;

    @PostMapping
    public Result login(@RequestBody User userDao) throws Exception
    {
        if (userDao != null)
        {
            log.info("UserDao:{}", userDao);
            return loginService.login(userDao);
        } else
        {
            return Result.error("登录失败!");
        }
    }

}
