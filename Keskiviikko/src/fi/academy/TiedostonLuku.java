package fi.academy;
import java.io.*;

public class TiedostonLuku {

    public static void main(String[] args) {
        String tulos = null;
        int rivienMäärä = 0;
        int merkkienMäärä = 0;
        try (FileReader fr = new FileReader("src/lukuaVarten.txt");
             BufferedReader in = new BufferedReader(fr)) {
            StringBuilder teksti = new StringBuilder();
            String rivi;
            while ((rivi = in.readLine()) != null) {
                rivienMäärä++;
                merkkienMäärä += rivi.length();
                teksti.append(rivi).append("\n");
            }
            tulos = teksti.toString();
            System.out.println(tulos);
            System.out.println("Rivien määrä " + rivienMäärä);
            System.out.println("Merkkien lukumäärä " + merkkienMäärä);
        } catch (FileNotFoundException ex) {
            System.out.println("Virhe: tiedostoa ei löytynyt");
        } catch (IOException ex) {
            System.out.println("Virhe: muu virhe lukiessa");
        }
    }
}
