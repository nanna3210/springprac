package com.nanna.tightloosecoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LooseCoupling {
    
    @Autowired
    Job job;
    
    

    public void showData() {
        job.displayJob ();
    }
}
