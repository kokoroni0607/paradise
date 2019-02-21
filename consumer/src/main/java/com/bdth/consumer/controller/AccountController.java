package com.bdth.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bdth.api.service.AccountService;
import com.bdth.common.domain.Account;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author weiming.zhu
 * @date 2019/2/20 15:03
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Reference(url = "dubbo://127.0.0.1:20880")
    private AccountService accountService;

    @RequestMapping("/get")
    public String getAccount(HttpServletResponse response, String name){
        return accountService.getAccount(name).getPassword();
    }
}
