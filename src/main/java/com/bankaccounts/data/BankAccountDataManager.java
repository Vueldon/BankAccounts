/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankaccounts.data;

import com.bankaccounts.core.BankAccount;

/**
 *
 * @author 0788763
 */
public class BankAccountDataManager 
{
    public BankAccount Create(BankAccount bankAccountToCreate)
    {
        return bankAccountToCreate;
    }
    
    public BankAccount Update(BankAccount bankAccountToUpdate)
    {
        return bankAccountToUpdate;
    }
    
    public boolean Delete(BankAccount bankAccountToDelete)
    {
        return true;
    }
}
