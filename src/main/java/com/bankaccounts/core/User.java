/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankaccounts.core;

import java.util.ArrayList;

/**
 *
 * @author 0788763
 */
public class User 
{
    private String firstName;
    private String lastName;
    
    private String email;
    
    private ArrayList<BankAccount> accounts;
    
    public User(String first, String last, String email)
    {
        this.firstName = first;
        this.lastName = last;
        this.email = email;
        
        this.accounts = new ArrayList<BankAccount>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<BankAccount> accounts) {
        this.accounts = accounts;
    }
    
    
}
