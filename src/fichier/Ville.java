package fichier;

public class Ville {
    String nom;
    String codeDepartement;
    String region;
    int population;



    public Ville(String nom, String codeDepartement, String region, int population) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.region = region;
        this.population = population;

    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", codeDepartement=" + codeDepartement +
                ", region='" + region + '\'' +
                ", population=" + population +

                '}';
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
