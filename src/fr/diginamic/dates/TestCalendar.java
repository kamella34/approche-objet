package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 19);
        cal.set(Calendar.MONTH, 4);
        cal.set(Calendar.YEAR, 2016);
        Date cal1 = cal.getTime();
        //System.out.println(cal1);

        SimpleDateFormat formateur = new SimpleDateFormat("dd/MMMM/yyyy ");
        Date date1 = new Date();
        String chaine1 = formateur.format(date1);
        System.out.println(chaine1);

        Calendar cal2 = Calendar.getInstance();
        Date date2 = cal2.getTime();
        System.out.println(date2);

        SimpleDateFormat formateurC = new SimpleDateFormat("EEEEE dd MMMMM yyyy HH:mm:s", Locale.CHINESE);
        System.out.println(formateurC.format(new Date()));
        SimpleDateFormat formateurD = new SimpleDateFormat("EEEEE dd MMMMM yyyy HH:mm:s", Locale.GERMAN);
        System.out.println(formateurD.format(new Date()));
        SimpleDateFormat formateurF = new SimpleDateFormat("EEEEE dd MMMMM yyyy HH:mm:s", Locale.FRANCE);
        System.out.println(formateurF.format(new Date()));
        SimpleDateFormat formateurR = new SimpleDateFormat("EEEEE dd MMMMM yyyy 'à' HH'h':mm'm':s's'", new Locale("ru","RU"));
        System.out.println(formateurR.format(new Date()));

    }

}
