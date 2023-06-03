package fr.diginamic.banque.entites;



public class Compte {
    private long numeroCompte;
    private double soldeCompte;

    public Compte(long numeroCompte,double soldeCompte){
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compte compte = (Compte) o;
        return numeroCompte == compte.numeroCompte && Double.compare(compte.soldeCompte, soldeCompte) == 0;
    }



    /**
     * @return
     */
    @Override
    public String toString() {
        return
                "numero de Compte : " + numeroCompte +
                ", solde du Compte : " + soldeCompte;

    }

    public long getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(long numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }
}
