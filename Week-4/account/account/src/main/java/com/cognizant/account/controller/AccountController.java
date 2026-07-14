package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.model.Account;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{accountId}")
    public Account fetchAccount(@PathVariable String accountId) {

        Account account = new Account();

        account.setAccountId(accountId);
        account.setAccountType("Salary");
        account.setAvailableBalance(98540.75);

        return account;
    }
}
