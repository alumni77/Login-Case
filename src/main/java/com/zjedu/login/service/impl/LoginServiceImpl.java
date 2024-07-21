package com.zjedu.login.service.impl;

import com.zjedu.login.mapper.LoginMapper;
import com.zjedu.login.service.LoginService;
import com.zjedu.login.pojo.Result;
import com.zjedu.login.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Lay
 */
@Slf4j
@Service
public class LoginServiceImpl implements LoginService
{
    @Resource
    private LoginMapper loginMapper;

    @Override
    public Result login(User user)
    {
        User loginUser = loginMapper.findUsers(user);
        if (loginUser == null)
        {
            return Result.error("用户不存在");
        }
        String storedPassword = loginUser.getPassword();
        log.info("存储的密码: {}", storedPassword);
        if (!user.getPassword().equals(storedPassword))
        {

            return Result.error("密码错误");
        }
        return Result.success();
    }
}
