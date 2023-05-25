package tri;

import listes.Villes;

import java.util.ArrayList;
import java.util.Collections;

public class TestTri {


    public static void main(String[] args) {
        Villes v1 = new Villes("Nice", 343000);
        Villes v2 = new Villes("Carcassonne", 47800);
        Villes v3 = new Villes("Narbonne", 53400);
        Villes v4 = new Villes("Lyon", 484000);
        Villes v5 = new Villes("Foix", 9700);
        Villes v6 = new Villes("Pau", 77200);
        Villes v7 = new Villes("Marseille", 850700);
        Villes v8 = new Villes("Tarbes", 40600);

        ArrayList<Villes> listVilles = new ArrayList<Villes>();

        listVilles.add(v1);
        listVilles.add(v2);
        listVilles.add(v3);
        listVilles.add(v4);
        listVilles.add(v5);
        listVilles.add(v6);
        listVilles.add(v7);
        listVilles.add(v8);


        Collections.sort(listVilles);
        System.out.println(listVilles);

        Collections.sort(listVilles, new ComparateurVillesHab());
        System.out.println(listVilles);
        Collections.sort(listVilles, new ComparateurVillesNom());

    }
}