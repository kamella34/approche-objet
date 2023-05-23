package fr.diginamic.banque.entites;

import java.util.Date;

public class Credit extends Operation {
    public Credit(String date, double montant) {
        super(date, montant);
    }

    @Override
    public String getType() {
        return "Credit";
    }

}
