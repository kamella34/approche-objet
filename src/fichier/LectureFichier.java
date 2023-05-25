package fichier;

import listes.Villes;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;


public class LectureFichier {
    public static void main(String[] args) throws Exception {
        Path newPath = Paths.get("C:/Users/vergn/Documents/diginamic/JAVA/Cours&Tp/tp/tp 15 - recensement2.csv");
        Path pathFile = Paths.get("C:/Users/vergn/Documents/diginamic/JAVA/Cours&Tp/tp/tp 15 - recensement.csv");
        List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);



        Iterator<String> iter = lines.iterator();
        List<Ville> listVille = new ArrayList<>();
        String firstLine = iter.next();
        while (iter.hasNext()) {
            String line = iter.next();
            String[] tokens = line.split(";");
            listVille.add(new Ville(tokens[6], tokens[2], tokens[1], Integer.parseInt(tokens[9].replace(" ", ""))));
        }

        for (Ville ville : listVille) {
            if (ville.getPopulation() < 25000)
                System.out.println(ville);
            //Files.write(newPath, ville, StandardOpenOption.APPEND);
        }


    }

}
