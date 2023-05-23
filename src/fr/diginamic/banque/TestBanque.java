package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

import java.util.Arrays;

public class TestBanque {
    public static void main(String[] args) {
        Compte cmpte1 = new Compte(12345, 205.67);
        System.out.println(cmpte1);
        CompteTaux compteTaux1 = new CompteTaux(23456, 300.50, 2.5);
        Compte[] cmptes = {cmpte1, compteTaux1};
        System.out.println(Arrays.toString(cmptes));
        CompteTaux.tauxLivretA = 0.3; //une variable static s'appelle aussi une variable de classe
        //pour y accceder j'utilise l'operateur . sur le nom de la classe

        for (Compte value : cmptes) {
            System.out.println(value);
        }
    }
}
