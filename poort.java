package oop1eind;

public class poort
{
    double startWaarde = 1.50; // Tarief per rit
    String locatie; // huidige poort-locatie

    public void inUitChecken(ov_kaart o)
    {
	// Inchecken als nog niet ingecheckt en genoeg saldo
	if (!o.getIncheck())
	{
	    if (o.saldo > startWaarde)
	    {
		o.setIncheck(true); // Markeer als ingecheckt
		o.saldo -= startWaarde; // Trek tarief af van saldo
		o.plaatsInchecken = locatie; // Sla incheck-locatie op
	    } else
	    {
		o.setIncheck(false); // Onvoldoende saldo: blijft uit
	    }
	} else
	{
	    // Uitchecken als al ingecheckt
	    o.setIncheck(false); // Markeer als uitgecheckt
	    o.plaatsUitchecken = locatie; // Sla uitcheck-locatie op
	}
    }

    public void info(ov_kaart o)
    {
	if (o.getIncheck())
	{
	    System.out.println("u bent ingecheckt"); // Toon ingecheckt
	    System.out.println(locatie); // Toon locatie
	} else
	{
	    if (o.saldo < startWaarde)
	    {
		System.out.println("u heeft niet genoeg saldo"); // Te weinig saldo
	    } else
	    {
		o.setIncheck(false); // Herbevestig uitgecheckt
		System.out.println("u bent uitgecheckt " + o.saldo); // Toon saldo
		System.out.println(locatie); // Toon locatie
	    }
	}
    }

    public void setLokatie(String l)
    {
	locatie = l; // Stel huidige locatie in
    }

}
