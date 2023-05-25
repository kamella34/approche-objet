package maps;

import listes.Villes;

import java.util.HashMap;
import java.util.Iterator;

public class MapVilles {
    public static void main(String[] args) {

        HashMap<Integer, Villes> mapVilles = new HashMap<>();

        Villes v1 = new Villes("Nice", 343000);
        Villes v2 = new Villes("Carcassonne", 47800);
        Villes v3 = new Villes("Narbonne", 53400);
        Villes v4 = new Villes("Lyon", 484000);
        Villes v5 = new Villes("Foix", 9700);
        Villes v6 = new Villes("Pau", 77200);
        Villes v7 = new Villes("Marseille", 850700);
        Villes v8 = new Villes("Tarbes", 40600);

        mapVilles.put(1,v1);
        mapVilles.put(2,v2);
        mapVilles.put(3,v3);
        mapVilles.put(4,v4);
        mapVilles.put(5,v5);
        mapVilles.put(6,v6);
        mapVilles.put(7,v7);
        mapVilles.put(8,v8);

        System.out.println(mapVilles.values());
        int habVille = mapVilles.get(1).getNbrHab();

        int cle = 1;
        Iterator<Integer> ite = mapVilles.keySet().iterator();
        while (ite.hasNext()){
            Integer key = ite.next();
           if( habVille > mapVilles.get(key).getNbrHab()){
                habVille = mapVilles.get(key).getNbrHab();
                cle = key;
            }
        }
        mapVilles.remove(cle);

        System.out.println(habVille);
        System.out.println(mapVilles.values());
    }
}
