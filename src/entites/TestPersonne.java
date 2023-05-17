package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne pers1 = new Personne();
        Personne pers2 = new Personne();

        pers1.nom = "wayne";
        pers1.prenom = "bruce";
        pers1.adressePostale = new AdressePostale();
        pers1.adressePostale.numeroDeRue = 1;
        pers1.adressePostale.libelleDeRue = "1007 Mountain Drive";
        pers1.adressePostale.codePostal = 12345;
        pers1.adressePostale.Ville = "Gotham City";

        pers2.nom = "kent";
        pers2.prenom = "clark";
        pers2.adressePostale = new AdressePostale();
        pers2.adressePostale.numeroDeRue = 1;
        pers2.adressePostale.libelleDeRue = "344 Clinton Street";
        pers2.adressePostale.codePostal = 62960;
        pers2.adressePostale.Ville = "Metropolis";

        System.out.println(pers1);
        System.out.println(pers2);
    }
}
