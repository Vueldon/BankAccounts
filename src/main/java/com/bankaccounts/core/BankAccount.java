/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankaccounts.core;

/**
 *
 * @author 0788763
 */
public class BankAccount 
{
    private String name;
    private double currentBalance;
    private BankAccountType accountType;
    
    public BankAccount(String name, double currentBalance, BankAccountType type)
    {
        this.name = name;
        this.currentBalance = currentBalance;
        this.accountType = type;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "name=" + name + ", currentBalance=" + currentBalance + ", accountType=" + accountType + '}';
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public BankAccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(BankAccountType accountType) {
        this.accountType = accountType;
    }
    
    
}
