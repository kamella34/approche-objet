package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private double taux;

    public CompteTaux(long numeroCompte,double soldeCompte, double taux){
        super( numeroCompte,soldeCompte);
        this.taux = taux;
    }

    @Override
    public String toString() {
        String compte = super.toString();
        return compte +" CompteTaux { " +
                "taux : " + taux +
                " }";
    }
}
