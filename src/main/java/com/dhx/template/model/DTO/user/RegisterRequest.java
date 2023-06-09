package com.dhx.template.model.DTO.user;

import com.dhx.template.common.constant.UserConstant;
import lombok.Data;

import javax.validation.constraints.Pattern;


/**
 * @author <a href="https://blog.dhx.icu/"> adorabled4 </a>
 * @className RegisterParam
 * @date : 2023/05/04/ 16:42
 **/
@Data
public class RegisterRequest {
    /**
     * 4~16位 数字,大小写字母组成
     */
    @Pattern(regexp = UserConstant.USER_ACCOUNT_REGEX,message = "账户名不符合规范")
    private String userAccount;


    /**
     * 至少8-16个字符，至少1个大写字母，1个小写字母和1个数字，其他可以是任意字符
     */
    @Pattern(regexp = UserConstant.PASSWORD_REGEX,message = "密码不符合规范")
    private String password;

    private String checkPassword;
}