package entites2;

import entites.AdressePostale;

public class PersonneGetSet {


    //signature + corp de la function
    public class Personne {
        //propriété attribut d'instance
        public String nom;
        public String prenom;
        public AdressePostale adressePostale;

        //constructeur
        public Personne(String nom, String prenom, AdressePostale adressePostale) {
            this.nom = nom;
            this.prenom = prenom;
            this.adressePostale = adressePostale;
        }

        // methode d'instance est une methode qui n'est pas static
        public Personne(String nom, String prenom) {
            this.nom = nom;
            this.prenom = prenom;
        }

        public void upperCaseName() {
            String nm = nom.toUpperCase();
            System.out.println(prenom + " " + nm + " " + adressePostale);
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public AdressePostale getAdressePostale() {
            return adressePostale;
        }

        public void setAdressePostale(AdressePostale adressePostale) {
            this.adressePostale = adressePostale;
        }
    }
}
