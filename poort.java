package oop1eind;
import java.util.Scanner;
public class poort
{
	
boolean incheckInfo;

    public boolean inchecken(ov_kaart o) {
	
	
	incheckInfo = o.getincheck();

	if(o.getincheck() == false ) {
   	    
   	 incheckInfo = true;
   	}else {
   	 incheckInfo = false;
   	}
   	return incheckInfo;
       }
    
    public String info(ov_kaart o) {
	
	if(incheckInfo == true) {
	    return "u bent ingecheckt";
	}else {
	    return "u bent al ingecheckt";
	    

	}
    }
    public double betaal(ov_kaart w) {
	
    
	if(incheckInfo == true) {
	    return w.saldoWaarde()-1.50;
	}else {
	    return w.saldoWaarde()-0.0;
    }
   }
}
