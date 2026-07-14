package com.cognizant.account.model;

public class Account {

    private String accountId;
    private String accountType;
    private double availableBalance;

    public Account() {
    }

    public Account(String accountId, String accountType, double availableBalance) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.availableBalance = availableBalance;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }
}
