package oop1eind;
public class driverclass
{
    public static void main(String[] args) {
	ov_kaart oc = new ov_kaart();
	poort po = new poort();
	reis r = new reis();
	opwarderen opw = new opwarderen();
	

        // scenario 1: in- en uitchecken zonder opwaardering
//        po.setLokatie("nijmegen");           // Stel poort-locatie in op Nijmegen
//        po.inUitChecken(oc);                   // Voer in- of uitcheck uit
//        po.info(oc);                           // Druk status en saldo af
//        po.setLokatie("amsterdam");         // Verander poort-locatie naar Amsterdam
//        po.inUitChecken(oc);                   // Voer in- of uitcheck uit
//        r.plaatsen(oc);                        // Bereken en boek reiskosten
//        po.info(oc);                           // Toon opnieuw status en saldo

        // scenario 2: in- en uitchecken na opwaardering
        oc.setSaldo(3.5);                      // Stel startsaldo in op €3,50

        po.setLokatie("nijmegen");           // Stel poort-locatie in op Nijmegen
        po.inUitChecken(oc);                   // Probeer inchecken
        po.info(oc);                           // Toon status (mogelijk te weinig saldo)

        po.setLokatie("amsterdam");         // Stel poort-locatie in op Amsterdam
        po.inUitChecken(oc);                   // Probeer uitchecken
        r.plaatsen(oc);                        // Boek reiskosten als mogelijk
        opw.ovOpwarderen(oc);                  // Vraag gebruiker op te waarderen
        po.setLokatie("nijmegen");           // Stel poort-locatie opnieuw in op Nijmegen
        po.inUitChecken(oc);                   // Check in na opwaardering
        po.info(oc);                           // Toon status na incheck
        po.setLokatie("amsterdam");         // Stel poort-locatie in op Amsterdam
        po.inUitChecken(oc);                   // Check uit bij Amsterdam
        r.plaatsen(oc);                        // Boek reiskosten voor deze reis
        po.info(oc);                           // Toon finale status en saldo

    }
    
}
