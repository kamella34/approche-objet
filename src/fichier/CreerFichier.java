package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;


public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path pathFile = Paths.get("C:/Users/vergn/Documents/diginamic/JAVA/Cours&Tp/tp/tp 15 - recensement.csv");
        Path newPath = Paths.get("C:/Users/vergn/Documents/diginamic/JAVA/Cours&Tp/tp/tp 15 - recensement2.csv");

        List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
        List<String> lines100 = new ArrayList<String>() ;

        for (int i = 0; i <= 100; i++) {
            lines100.add(lines.get(i));
            System.out.println(lines100);
        }
        Files.write(newPath, lines100,StandardCharsets.UTF_8);


    }
}
