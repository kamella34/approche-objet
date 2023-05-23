package listes;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(-1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(-2);
        list.add(4);
        list.add(8);
        list.add(5);

        /*
        convertir un tableau en liste
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
        ArrayList<Integer> targetList = new ArrayList<>(Arrays.asList(new Integer[]{ 0, 1, 2, 3, 4, 5 }));
        */


        Object objMax = Collections.max(list);
        System.out.println("Le plus grand de la liste: "+objMax);

        Object objMin = Collections.min(list);
        System.out.println("Le plus petit de la liste: "+objMin);


        int count =0;
        Iterator<Integer> ite = list.iterator();
        while (ite.hasNext()) {
            count++;
            Integer nbr = ite.next();
            if (nbr < 0) {
                System.out.println(count);
                list.set(count -1,Math.abs(nbr));

            }
        }

        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {

            Integer nbr = iterator.next();
            if (nbr < 0) {
                System.out.println(nbr);
                iterator.remove();
            }
        }



    }


}
