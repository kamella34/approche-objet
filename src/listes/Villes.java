package listes;



public class Villes implements Comparable<Villes> {
    String nom;
    Integer nbrHab;

    public Villes(String nom, int nbrHab) {
        this.nom = nom;
        this.nbrHab = nbrHab;
    }
   //Trier par nbr d'habitants
    public int compareTo(Villes autre) {
        if (this.nbrHab> autre.getNbrHab()){
            return 1;
        }
        if (this.nbrHab < autre.getNbrHab()){
            return -1;
        }
        return 0;
    }

    //Afficher par ordre alphabetique
 /*   public int compareTo(Villes autre) {
        int result = this.nom.compareTo(autre.getNom());
        return result;
    }*/


    @Override
    public String toString() {
        return
                "Ville de " + nom + ": " + nbrHab + " habitants ";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNbrHab() {
        return nbrHab;
    }

    public void setNbrHab(int nbrHab) {
        this.nbrHab = nbrHab;
    }
}
