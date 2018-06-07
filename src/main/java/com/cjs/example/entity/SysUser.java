package com.cjs.example.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.jackson.JsonComponent;

import java.io.Serializable;
import java.util.List;

@Data
@ToString
@JsonComponent
public class SysUser implements Serializable {

    private Long id;

    /**
     * 用户编号
     */
    private String usercode;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 用户角色
     */
    private List<SysRole> roleList;

    public SysUser() {
    }

    public SysUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
