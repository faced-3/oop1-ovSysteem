package oop1eind;

public class ov_kaart
{
    double saldo = 35.0; // Huidig saldo op de kaart
    boolean incheck = false; // Status: ingecheckt of niet
    String plaatsInchecken; // Locatie van inchecken
    String plaatsUitchecken; // Locatie van uitchecken

    public boolean getIncheck()
    {
	return incheck; // Geeft huidige incheck-status terug
    }

    public void setIncheck(boolean p)
    {
	incheck = p; // Zet incheck-status
    }

    public void setSaldo(double s)
    {
	saldo = s; // Fysiek saldo instellen
    }

    public void setPlaats(String p)
    {
	plaatsInchecken = p; // Zet incheck-locatie
    }

    public String getPlaats()
    {
	return plaatsInchecken; // Haal incheck-locatie op
    }

    public void setPlaatsuitchecken(String p)
    {
	plaatsUitchecken = p; // Zet uitcheck-locatie
    }

    public String getPlaatsUitchecken()
    {
	return plaatsUitchecken; // Haal uitcheck-locatie op
    }

    public double getSaldo()
    {
	return saldo; // Haal huidig saldo op
    }

}
