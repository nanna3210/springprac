package com.nanna.tightloosecoupling;

import org.springframework.stereotype.Component;

//@Component
public class Phtographer implements  Job{

    
    
    
    @Override
    public void displayJob ( ) {
        System.out.println ("iam an photographer ");
    }
}
