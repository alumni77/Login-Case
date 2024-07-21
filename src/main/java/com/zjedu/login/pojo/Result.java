package com.zjedu.login.pojo;
//统一响应结果

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lay
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T>
{
    //业务状态码  200-成功  400-失败
    private Integer code;
    //提示信息
    private String message;
    //响应数据
    private T data;

    //快速返回操作成功响应结果(带响应数据)
    public static <E> Result<E> success(E data)
    {
        return new Result<>(200, "登录成功!", data);
    }

    //快速返回操作成功响应结果
    public static Result success()
    {
        return new Result(200, "登录成功!", null);
    }

    public static Result error(String message)
    {
        return new Result(400, message, null);
    }
}
