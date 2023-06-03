package fr.diginamic.chaines;

import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;
import java.util.Date;

public class TestStringBuilder {


    public static void main(String[] args) {

        long debut = System.currentTimeMillis();

        String chaine = "";
        for (int i = 0; i < 100000; i++) {
            chaine += i;
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

        long debut2 = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
           builder.append(i);
        }
        long fin2 = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin2 - debut2));


    }
}
