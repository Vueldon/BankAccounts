/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankaccounts.data;

import com.bankaccounts.core.User;
import com.bankaccounts.utility.ConsoleLogger;

/**
 *
 * @author 0788763
 */
public class UserDataManager 
{
    private ConsoleLogger logger;
    
    public UserDataManager()
    {
        logger = new ConsoleLogger("UserDataManager");
    }
    
    public User FindByEmail(String email)
    {
     // fake it til you make it
        return new User("John", "Smith", "john#@test.com");
    }
    
    public User Create(User userToCreate)
    {
        return userToCreate;
    }
    
    public User Update(User userToUpdate)
    {
        return userToUpdate;
    }
    
    public boolean Delete(User userToDelete)
    {
        return true;
    }
}
