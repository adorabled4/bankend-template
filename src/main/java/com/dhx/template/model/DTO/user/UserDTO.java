package com.dhx.template.model.DTO.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author <a href="https://blog.dhx.icu/"> adorabled4 </a>
 * @className UserDTO
 * @date : 2023/05/04/ 16:18
 **/
@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 昵称
     */
    private String userName;

    /**
     * 头像地址
     */
    private String avatarUrl;

    /**
     * 用户角色
     */
    private String userRole;

}
