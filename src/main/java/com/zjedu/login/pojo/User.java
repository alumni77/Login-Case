package com.zjedu.login.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;

/**
 * @author Lay
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User
{
    @Pattern(regexp = "^\\S{11}", message = "手机号长度为11位数")
    String phone;
    @Pattern(regexp = "^\\S{5,16}", message = "密码长度为5-16")
    String password;
}
