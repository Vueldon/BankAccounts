/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankaccounts;

import com.bankaccounts.core.User;
import com.bankaccounts.data.UserDataManager;
import com.bankaccounts.utility.ConsoleLogger;

/**
 *
 * @author 0788763
 */
public class Main 
{
    public static void main(String[] args) 
    {
        ConsoleLogger logger = new ConsoleLogger("Main");
        
        logger.LogInfo("Starting program");
        
        UserDataManager userDm = new UserDataManager();
        User userFromDatabase = userDm.FindByEmail("john@test.com");
        
        logger.LogInfo(userFromDatabase.toString());
        
        logger.LogWarning("Ending program");
    }
    
}
