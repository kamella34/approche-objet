package tri;
import listes.Villes;

import java.util.Comparator;

public class ComparateurVillesHab implements Comparator<Villes> {
   public int compare(Villes autre1,Villes autre2){
       int result = autre1.getNbrHab().compareTo(autre2.getNbrHab());
       return result;
   }
}
