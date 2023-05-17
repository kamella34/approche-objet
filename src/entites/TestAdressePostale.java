package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale();
        AdressePostale adr2 = new AdressePostale();

        adr1.numeroDeRue = 1;
        adr1.libelleDeRue = "rue terre";
        adr1.codePostal = 24000;
        adr1.Ville = "Terre";

        adr2.numeroDeRue =2;
        adr2.libelleDeRue = "rue lune";
        adr2.codePostal = 34000;
        adr2.Ville = "Lune";
    }
}
