package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> villes = new ArrayList<String>();
        villes.add("Nice");
        villes.add("Carcassone");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");


        //System.out.println(villes.get(0));


         String maxVille = villes.get(0);
         int firstVilleNb = maxVille.length();

        for (String ville : villes) {
            if (firstVilleNb < ville.length()){
                 firstVilleNb = ville.length();
                  maxVille = ville.toUpperCase();

            }
            String villeMaj = ville.toUpperCase();
            System.out.println(villeMaj);
        }
        System.out.println("La ville qui a le plus de lettres est " + maxVille);



        Iterator<String> iterator = villes.iterator();
        while (iterator.hasNext()) {
        String villeNext = iterator.next();
            if (villeNext.startsWith("N"))  {
                iterator.remove();
            }
        }
        System.out.println(villes);

    }


}
