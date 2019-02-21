package com.bdth.producer.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bdth.api.service.AccountService;
import com.bdth.common.domain.Account;
import org.springframework.stereotype.Component;

/**
 * @author weiming.zhu
 * @date 2019/2/20 11:29
 */
@Service(interfaceClass = AccountService.class)
@Component
public class AccountServiceImpl implements AccountService {
    @Override
    public Account getAccount(String name) {
        return new Account("Adam","adam");
    }
}
