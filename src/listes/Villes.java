package listes;

import fr.diginamic.testenumeration.EnumerationContinent;

public class Villes implements Comparable<Villes> {
    private String nom;
    private Integer nbrHab;
    private EnumerationContinent continent;

  
    /**
     *
     * @param nom nom de la ville
     * @param nbrHab nombre d'habitants
     */
    public Villes(String nom, int nbrHab) {
        this.nom = nom;
        this.nbrHab = nbrHab;
        this.continent = continent.INDETERMINE;
    }

    public Villes(String nom, int nbrHab, EnumerationContinent continent) {
        this.nom = nom;
        this.nbrHab = nbrHab;
        this.continent = continent;
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
                "Ville de " + nom + ": " + nbrHab + " habitants, continent: "+ continent.getNomContinent();
    }

    public void setNbrHab(Integer nbrHab) {
        this.nbrHab = nbrHab;
    }

    public EnumerationContinent getContinent() {
        return continent;
    }

    public void setContinent(EnumerationContinent continent) {
        this.continent = continent;
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
