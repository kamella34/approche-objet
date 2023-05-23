package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        Credit cred1 = new Credit("13/01/2012", 234.59);
        Credit cred2 = new Credit("24/02/2012", 123.59);
        Debit deb1 = new Debit("15/01/2012", 70.0);
        Debit deb2 = new Debit("25/01/2012", 20.0);

        Operation[] array = {cred1, cred2, deb1, deb2};

        double soldeGlobal = 0;
        for (Operation value : array) {
            System.out.println(value);
            if(value.getType().equals("Credit")) {
                soldeGlobal += value.getMontant();
            }else if(value.getType().equals("Debit")) {
                soldeGlobal -= value.getMontant();
            }
        }
        System.out.println("Solde Global : " + soldeGlobal);
    }
}
