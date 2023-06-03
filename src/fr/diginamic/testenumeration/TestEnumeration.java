package fr.diginamic.testenumeration;

public class TestEnumeration {
    public static void main(String[] args) {
        Saison[] saisonsV = Saison.values();


            for(Saison saison : saisonsV){
                System.out.println(saison.getNom());

        }

        Saison saison2 = Saison.ETE;
        System.out.println(saison2.getNom());

        Saison saison4 = Saison.HIVER;
        System.out.println("Order: "+saison4.getOrder()+" "+"Saison: "+ saison4.getNom());


        Saison quelSsaison =Saison.findSaison("Eté");
        System.out.println(quelSsaison);
    }
}
