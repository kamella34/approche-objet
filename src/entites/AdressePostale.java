package entites;

public class AdressePostale {
    int numeroDeRue;
    String libelleDeRue;
    int codePostal;
    String Ville;

    @Override
    public String toString() {
        return "AdressePostale{" +
                "numeroDeRue=" + numeroDeRue +
                ", libelleDeRue='" + libelleDeRue + '\'' +
                ", codePostal=" + codePostal +
                ", Ville='" + Ville + '\'' +
                '}';
    }
}


