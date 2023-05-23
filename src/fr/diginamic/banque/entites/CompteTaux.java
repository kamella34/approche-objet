package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private double taux;
    public static double tauxLivretA;
     public static final byte TEST_CONSTANTE = 1;// ya pas de constante dans les constructeur

    public CompteTaux(long numeroCompte,double soldeCompte, double taux){
        super( numeroCompte,soldeCompte);
        this.taux = taux;
    }

    @Override
    public String toString() {
        String compte = super.toString();
        return compte +
                " Taux : " + this.taux + " Taux livret A :" + tauxLivretA;

    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
