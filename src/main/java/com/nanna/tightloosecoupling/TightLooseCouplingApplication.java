package com.nanna.tightloosecoupling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import javax.print.Doc;

@SpringBootApplication
public class TightLooseCouplingApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run ( TightLooseCouplingApplication.class , args );
		
//		LooseCoupling looseCoupling = new LooseCoupling ( new Enginner () );
//		looseCoupling.showData ();
		
		Enginner enginner = ctx.getBean ( Enginner.class );
		enginner.displayJob ();
		
	}

}
