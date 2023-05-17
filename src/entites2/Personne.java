package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adressePostale;

    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void upperCaseName() {
        String nm = nom.toUpperCase();
        System.out.println(prenom + " " + nm);
    }

    public void nameModify(String name) {
        this.nom = name;
    }

    public void firstnameModify(String firstname) {
        this.prenom = firstname;
    }

    public void adresseModify(AdressePostale adresse) {
        this.adressePostale = adresse;

    }

    public String returnName(){
        return this.nom;
    }

    public String firstnameReturn(){
        return this.prenom;
    }

    public AdressePostale adressReturn(){
        return this.adressePostale;
    }


    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adressePostale=" + adressePostale +
                '}';
    }
}
