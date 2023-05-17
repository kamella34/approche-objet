package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        AdressePostale adr1 = new AdressePostale(1,"1007 Mountain Drive",12345, "Gotham City");
        AdressePostale adr2 = new AdressePostale(1,"344 Clinton Street",62960, "Metropolis");

        Personne pers1 = new Personne("wayne","bruce",adr1);
        Personne pers2 = new Personne("kent","clark",adr2);
        Personne pers3 = new Personne("wonder", "women");

/*
        pers1.adressePostale = new AdressePostale(1,"1007 Mountain Drive",12345, "Gotham City");
        pers2.adressePostale = new AdressePostale(1,"344 Clinton Street",62960, "Metropolis");

        pers1.nom = "wayne";
        pers1.prenom = "bruce";
        pers1.adressePostale.numeroDeRue = 1;
        pers1.adressePostale.libelleDeRue = "1007 Mountain Drive";
        pers1.adressePostale.codePostal = 12345;
        pers1.adressePostale.ville = "Gotham City";
        pers2.nom = "kent";
        pers2.prenom = "clark";
        pers2.adressePostale.numeroDeRue = 1;
        pers2.adressePostale.libelleDeRue = "344 Clinton Street";
        pers2.adressePostale.codePostal = 62960;
        pers2.adressePostale.ville = "Metropolis";
*/

        pers1.upperCaseName();
        pers1.nameModify("bat");
        pers3.firstnameModify("alfred");
        pers1.adresseModify(adr2);

        System.out.println(pers1);
        System.out.println(pers2);
        System.out.println(pers3);

        String pers1Name = pers1.returnName();
        String pers1Firstname= pers1.firstnameReturn();
        AdressePostale pers1Adress = pers1.adressReturn();

        System.out.println(pers1Name);
        System.out.println(pers1Firstname);
        System.out.println(pers1Adress);

    }
}
