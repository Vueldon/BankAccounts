/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankaccounts.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 0788763
 */
public class ConsoleLogger 
{
    private String context;

    public ConsoleLogger(String context)
    {
        this.context = context;
    }
    
    public void LogInfo(String logData)
    {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        
        System.out.println("info\t[" + timeStamp + "] (" + this.context + ") - " + logData);
    }
    
    public void LogWarning(String logData)
    {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        
        System.out.println("info\t[" + timeStamp + "] (" + this.context + ") - " + logData);
    }
    
    public void LogError(String logData)
    {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        
        System.out.println("info\t[" + timeStamp + "] (" + this.context + ") - " + logData);
    }
}
