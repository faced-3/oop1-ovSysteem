package oop1eind;

public class reis
{

    public void plaatsen(ov_kaart o)
    {
	// Bereken reiskosten op basis van in- en uitcheck-locaties
	if ("nijmegen".equals(o.plaatsInchecken) && "arhnem".equals(o.plaatsUitchecken))
	{
	    if (o.saldo > 10)
	    {
		o.saldo -= 10; // Trek €10 af voor Nijmegen-Arhnem
	    } else
	    {
		System.out.println("u heeft niet genoeg saldo");
	    }
	} else if ("nijmegen".equals(o.plaatsInchecken) && "amsterdam".equals(o.plaatsUitchecken))
	{
	    if (o.saldo > 20)
	    {
		o.saldo -= 20; // Trek €20 af voor Nijmegen-Amsterdam
	    } else
	    {
		System.out.println("u heeft niet genoeg saldo");
	    }

	}
    }
}
