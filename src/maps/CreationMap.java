package maps;

import java.util.HashMap;

public class CreationMap {
    public static void main(String[] args) {
        HashMap<String, Double> mapSalaire  = new HashMap();
        Double salaire1 = 1750.0;
        Double salaire2 = 1825.0;
        Double salaire3 = 2250.0;
        Double salaire4= 2015.0;
        Double salaire5 = 2418.0;

        mapSalaire.put("Paul", salaire1);
        mapSalaire.put("Hicham", salaire2);
        mapSalaire.put("Hicham", salaire2);
        mapSalaire.put("Yu", salaire3);
        mapSalaire.put("Ingrid", salaire4);
        mapSalaire.put("Chantal", salaire5);

        System.out.println(mapSalaire.size());


    }



}
