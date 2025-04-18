package oop1eind;

import java.util.Scanner;

public class opwarderen
{
    double opwaarderen; // Bedrag om op te waarderen
    Scanner sc = new Scanner(System.in); // Scanner voor invoer

    public void ovOpwarderen(ov_kaart o)
    {
	System.out.println("hoeveel euro wilt u op uw ov kaart zetten");
	opwaarderen = sc.nextDouble(); // Lees invoerbedrag
	o.saldo += opwaarderen; // Verhoog kaart-saldo
	System.out.println("nieuwe saldo = " + o.saldo); // Toon nieuw saldo

    }
}
