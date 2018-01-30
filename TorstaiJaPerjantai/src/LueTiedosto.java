import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LueTiedosto {
    public static void main(String[] args) {
        String nimi = "Luetieosto.java";
        String polku = "src/";
        try {
            lueTiedosto(nimi, polku);
        } catch (IOException e) {
            System.err.println("Mainissä ongelma: " + e.getMessage());
        }
    }

    private static void lueTiedosto(String nimi, String polku) throws IOException{
        Path tiedosto = Paths.get(polku, nimi);
        List<String> rivit;
        try {
            rivit = Files.readAllLines(tiedosto);
        } catch (IOException e) {
            System.err.println("Saatiin poikkeus kiinni, heitetään se eteenpäin");
            throw e;
        }
        System.out.println(rivit);
    }
}
