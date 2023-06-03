package fr.diginamic.testenumeration;

import listes.Villes;

import java.util.ArrayList;

import static fr.diginamic.testenumeration.EnumerationContinent.*;

public class TestContinent {
    public static void main(String[] args) {

        ArrayList listVilleContinent = new ArrayList<>();

    Villes newYork =new Villes ("New-York", 111110003, AMERIQUE);
    Villes paris =new Villes ("Paris", 111110003, EUROPE);
    Villes pekin =new Villes ("Pékin", 111110003, ASIE);
    Villes moscou =new Villes ("Moscou", 111110003, EUROPE);
    Villes Berlin =new Villes ("Berlin", 111110003, EUROPE);
    Villes sydney =new Villes ("Sydney", 111110003, ASIE);
    Villes saoPaulo =new Villes ("Sao-Paulo", 111110003, AMERIQUE);
    Villes dakar =new Villes ("Dakar", 111110003, AFRIQUE);
        listVilleContinent.add(newYork);
        listVilleContinent.add(paris);
        listVilleContinent.add(pekin);
        listVilleContinent.add(moscou);
        listVilleContinent.add(Berlin);
        listVilleContinent.add(sydney);
        listVilleContinent.add(saoPaulo);
        listVilleContinent.add(dakar);
        System.out.println(listVilleContinent);
    }
}
