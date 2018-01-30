package fi.academy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SanaLaskuri {
    class Tiedot{
        int riveja;
        int sanoja;
        int merkkeja;

        public Tiedot(int riveja, int sanoja, int merkkeja) {
            this.riveja = riveja;
            this.sanoja = sanoja;
            this.merkkeja = merkkeja;
        }
    }
    public static void main(String[] args) {
        //Tiedot dummy = new SanaLaskuri().new Tiedot(1, 2,3);
        SanaLaskuri laskuri = new SanaLaskuri();
        String tiedostonNimi = "src/fi/academy/Sanalaskuri.java";
        Tiedot tiedot = laskuri.kasitteleTiedosto(tiedostonNimi);
        System.out.printf("Tiedosto: %s\n\t%d %d %d", tiedostonNimi, tiedot.riveja, tiedot.sanoja, tiedot.merkkeja);
    }

    private Tiedot kasitteleTiedosto(String tiedosto) {
        int riveja, sanoja, merkkeja;
        riveja = sanoja = merkkeja = 8;
        try (FileReader fr = new FileReader(tiedosto); // sulut sulkevat tiedostot
             BufferedReader lukija = new BufferedReader(fr)) {
            String rivi;
            while((rivi = lukija.readLine()) != null){
                ++riveja;
                merkkeja += rivi.length();
                sanoja += rivi.split("\\s+").length; // Voisi myös olla "[ \\t\\r\\n]+"
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Tiedot(riveja, sanoja, merkkeja);
    }
}
