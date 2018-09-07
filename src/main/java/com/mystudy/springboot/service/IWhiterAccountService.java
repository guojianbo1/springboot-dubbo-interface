package com.mystudy.springboot.service;

import com.mystudy.springboot.model.WhitelistAccount;

/**
 * @Auther: GJB
 * @Date: 2018/9/6 15:03
 * @Description:
 */
public interface IWhiterAccountService {
    public String sayHi(String account);

    public WhitelistAccount selectWhitelistAccountById(Integer id);
}
