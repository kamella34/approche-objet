package listes;

import java.util.ArrayList;

public class Villes {
    String nom;
    int nbrHab;

    public Villes(String nom, int nbrHab) {
        this.nom = nom;
        this.nbrHab = nbrHab;
    }

    @Override
    public String toString() {
        return
                "Nombre d'habitants à " + nom + ": " + nbrHab + " " ;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrHab() {
        return nbrHab;
    }

    public void setNbrHab(int nbrHab) {
        this.nbrHab = nbrHab;
    }
}
