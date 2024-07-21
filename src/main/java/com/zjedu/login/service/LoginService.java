package com.zjedu.login.service;

import com.zjedu.login.pojo.Result;
import com.zjedu.login.pojo.User;

/**
 * @author Lay
 */
public interface LoginService
{
    Result login(User userDao);
}
