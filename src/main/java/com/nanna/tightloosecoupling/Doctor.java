package com.nanna.tightloosecoupling;

import org.springframework.stereotype.Component;

//@Component
public class Doctor implements Job{
    
    
    @Override
    public void displayJob ( ) {
        System.out.println ("i m a doctor");
    }
}
