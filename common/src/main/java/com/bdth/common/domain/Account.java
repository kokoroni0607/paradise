package com.bdth.common.domain;

import java.io.Serializable;

/**
 * @author weiming.zhu
 * @date 2019/2/20 10:20
 */
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String password;

    public Account() {
    }

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
