package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Rouge");
        list1.add("Vert");
        list1.add("Orange");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Blanc");
        list2.add("Bleu");
        list2.add("Orange");

        ArrayList<String> list3 = new ArrayList<>();
        for (String couleurs : list1){
            list3.add(couleurs);
        }
        for (String couleurs : list2){
            list3.add(couleurs);
        }
        System.out.println(list3);
    }

}
