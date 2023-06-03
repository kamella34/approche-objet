package fr.diginamic.testenumeration;

public enum EnumerationContinent {
    AFRIQUE("Afrique"),
    EUROPE("Europe"),
    ASIE("Asie"),
    AMERIQUE("Amerique"),
    OCEANIE("Oceanie"),
    INDETERMINE("Indeterminé");

    String nomContinent;
    private EnumerationContinent(String nomContinent){

        this.nomContinent = nomContinent;
    }

    public String getNomContinent() {
        return nomContinent;
    }
}
