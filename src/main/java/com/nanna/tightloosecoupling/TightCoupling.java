package com.nanna.tightloosecoupling;

public class TightCoupling {
    
    Doctor doctor;
    Enginner enginner;
    
    
    public TightCoupling ( Doctor doctor , Enginner enginner ) {
        this.doctor   = doctor;
        this.enginner = enginner;
    }
    
    
    public void showdata(){
        doctor.displayJob ();
        enginner.displayJob ();
        
        
    }
}
