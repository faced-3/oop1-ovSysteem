package oop1eind;
import java.util.*;
public class driverclass
{
    public static void main(String[] args) {
	ov_kaart oc = new ov_kaart();
	poort po = new poort();
//	    Scanner input = new Scanner(System.in);
	 
	
	
	   
	
	
	
	po.inchecken(oc);
//	 po.betaal(oc);
System.out.println(oc.saldo);
	po.info(oc);
	
	po.inchecken(oc);

	po.info(oc);
    }
    
}
