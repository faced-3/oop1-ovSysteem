package oop1eind;

import java.util.Scanner;

public class ov_kaart
{

double saldo = 3.0;
boolean incheck = false;
String plaats;

   
    public boolean getincheck() {
	return incheck;
    }
    public void setIncheck(boolean p) {
	incheck = p;
    }
    public void setSaldo(double s) {
	saldo = s;
       }
    public void setPlaats(String p) {
   	plaats = p;
          }
    public double getSaldo() {
  	return saldo;
      }

}
