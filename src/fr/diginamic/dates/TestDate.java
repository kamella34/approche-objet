package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {

        Date d1 = new Date(81,9,31);
        System.out.println(d1);
        Calendar cal =Calendar.getInstance();
        System.out.println(cal.getTime());

        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        Date d2 = new Date();
        String chaine1 = formateur.format(d2);
        System.out.println(chaine1);


        System.out.println(d2.getDay());


    }
}
