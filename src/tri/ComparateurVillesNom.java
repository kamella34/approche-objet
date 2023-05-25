package tri;
import listes.Villes;

import java.util.Comparator;

public class ComparateurVillesNom implements Comparator<Villes> {
    public int compare(Villes autre1,Villes autre2){
        int result = autre1.getNom().compareTo(autre2.getNom());
        return result;
    }
}