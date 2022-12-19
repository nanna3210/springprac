package com.nanna.tightloosecoupling;

import org.springframework.stereotype.Component;

@Component
public class Enginner implements  Job{
    
    @Override
    public void displayJob ( ) {
        System.out.println ("i am an Engineer");
    }
    
    
    
}
