package fr.diginamic.testenumeration;

public enum Saison {
    PRINTEMPS("Printemps",1),
    ETE("Eté",2),
    AUTOMNE("Automne",3),
    HIVER("Hiver",4);

   private String nom;
   private int order;

   private Saison(String nom, int order){
       this.nom = nom;
       this.order = order;
   }

    public static Saison findSaison (String libelle) {
        Saison[] saisons = Saison.values();
        for (Saison saison : saisons) {
            if (saison.getNom().equals(libelle)) {
                return saison;
            }
        }
        return null;
    }


    public String getNom(){
       return nom;
   }
   public int getOrder(){
       return order;
   }


}
