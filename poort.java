package oop1eind;
import java.util.Scanner;
public class poort
{
	
boolean incheckInfo;

String notSaldo = "u heeft niet genoeg saldo";
double startWaarde = 1.50;
String lokaatie;

public void keuze() {
    
    
}

    public void inchecken(ov_kaart o) {
	
	
	if(o.getincheck() == false ) {
	    if(o.saldo > startWaarde) {
		o.setIncheck(true);
		 o.saldo -= startWaarde;

	    }else {

   	o.setIncheck(false);
   	 }
   	}else {
      	 o.setIncheck(false);
   	}
       }
    
    public void info(ov_kaart o) {
	
	if(o.getincheck() == true) {
	    System.out.println("u bent ingecheckt"); 
	}else {
	    if(o.getincheck() == false && o.saldo < startWaarde) {
		System.out.println("u heeft niet genoeg saldo");

	    }else {
	    
	    o.setIncheck(false);
	    System.out.println("u bent uigecheckt" + " " +  o.saldo);
	    }
	    }
	    

	
    }
    public void betaal(ov_kaart o) {
	
	    o.saldo -= startWaarde;

	}
	
    
  
}
