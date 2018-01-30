import java.util.*;

public class MapHarjoitus {
    private static Map<String, String> viikonpaivat = new HashMap<String, String>();
    private static String[] paivatTaulukossa = new String[]{"maanantai", "tiistai", "keskiviikko", "torstai", "perjantai", "lauantai", "sunnuntai"};

    public static void main(String[] args) {
        viikonpaivat.put("maanantai", "Monday");
        viikonpaivat.put("tiistai", "Tuesday");
        viikonpaivat.put("keskiviikko", "Wednesday");
        viikonpaivat.put("torstai", "Thursday");
        viikonpaivat.put("perjantai", "Friday");
        viikonpaivat.put("lauantai", "Saturday");
        viikonpaivat.put("sunnuntai", "Sunday");

        tulostaViikonpaivat(viikonpaivat, paivatTaulukossa);

        for (String avain : viikonpaivat.keySet()){
            String uusiPaiva = viikonpaivat.get(avain);
            String ekaKirjain = uusiPaiva.substring(0,1);
            uusiPaiva = uusiPaiva.replaceFirst(ekaKirjain, ekaKirjain.toLowerCase());
            viikonpaivat.put(avain, uusiPaiva);
        }
        tulostaViikonpaivat(viikonpaivat, paivatTaulukossa);

    }
    public static void tulostaViikonpaivat(Map kartta, String[] taulukko){
        for (int i = 0; i < taulukko.length; i++) {
            System.out.print(taulukko[i] + ", ");
            System.out.println(kartta.get(taulukko[i]));
        }
    }
}
