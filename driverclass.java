package oop1eind;
import java.util.*;
public class driverclass
{
    public static void main(String[] args) {
	ov_kaart oc = new ov_kaart();
	poort po = new poort();
	
	System.out.println(po.inchecken(oc));
	System.out.println(po.info(oc));
	System.out.println(po.betaal(oc));

        oc.ov_chipKaart();
    }
    
}
