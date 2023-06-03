package fichier;

import listes.Villes;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class LectureFichier {
    public static void main(String[] args) throws Exception {
        Path newPath = Paths.get("C:/Users/vergn/Documents/diginamic/JAVA/Cours&Tp/tp/tp 15 - recensement2.csv");
        Path pathFile = Paths.get("C:/Users/vergn/Documents/diginamic/JAVA/Cours&Tp/tp/tp 15 - recensement.csv");
        List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
        ArrayList<String> listSmallVille = new ArrayList<>();


        Iterator<String> iter = lines.iterator();
        List<Ville> listVille = new ArrayList<>();
        String firstLine = iter.next();
        while (iter.hasNext()) {
            String line = iter.next();
            String[] tokens = line.split(";");
            //listVille.add(new Ville(tokens[6], tokens[2], tokens[1], Integer.parseInt(tokens[9].replace(" ", ""))));
        }

        for (Ville ville : listVille) {
            if (ville.getPopulation() < 25000) {
                listSmallVille.add(ville.getNom()+";"+ville.getCodeDepartement()+";"+ ville.getRegion()+";"+ville.getPopulation());
            }
        }
        //System.out.println(listSmallVille);

       Files.write(newPath,  listSmallVille, StandardCharsets.UTF_8);

    }

}

