package fr.diginamic.banque.entites;

import java.util.Date;

public class Debit extends Operation {
    public Debit(String date, double montant) {
        super(date, montant);
    }

    @Override
    public String getType() {
        return "Debit";
    }

}