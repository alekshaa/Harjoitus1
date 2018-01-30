import java.util.*;

public class KysymysPeli {
    private static Scanner lukija = new Scanner(System.in);

    private static String[] kysymykset = {"Mitä löytyy luokkakirjastosta java.math?    1. BigInteger    2. pistokkeet",
            "Mitä luokkaa kutsutaan kaikkien luokkien äidiksi?    1. java.lang.Object    2. java.lang.String",
            "Kuinka String luokan merkkijonoja yhdistetään?    1. add metodilla    2. +-operaattorilla",
            "Mitä tekee String luokan metodi substring()?    1. erottaa merkkijonosta osajonon    2. palauttaa merkkijonon viimeisen merkin",
            "Toteuttaako StringBuilder CharSequence rajapinnan?    1. Ei    2. Kyllä",
            "Rajapinta määritellään sanalla:    1. implements    2. interface",
            "Rajapinta toteutetaan sanalla:    1. implements    2. interface",
            "Kumpi sana ilmaisee luokan periytymistä:    1. implements    2. extends",
            "Mistä luokasta Javan luokat periytyvät pohjimmiltaan?    1. java.lang.object    2. java.lang.system",
            "Voiko abstraktista luokasta luoda ilmentymän new-operaattorilla?    1. Ei    2. Kyllä",
            "Yleinen metodi tietovirran sulkemiseksi on:    1. terminate()  2. close()",
            "BufferedReader -luokka tarjoaa mahdollisuuden lukea kokonaisia:    1. rivejä   2. tiedostoja",
            "Tarkoittaako serialisointi olion tilan muuntamista tallennettavaan muotoon?  1. Ei   2. Kyllä",
            "Kumpi näistä paketeista on tarkoitettu edistyneempään käyttöön?   1. java.io   2. java.nio",
            "Tiedoston polkua kirjoittaessa kannattaa hakemistoerottimena käyttää aina merkkiä: 1. /    2 \\",
            "Poikkeuksen syntyessä virheen aiheuttanut koodi luo _____ jonka se palauttaa 1. Virheilmoituksen  2. Poikkeusolion",
            "Poikkeusolion kantaluokka on 1. java.exception.Object  2. java.lang.Exception",
            "Ensimmäinen asia, jonka konstruktori sitä kutsuttassa tekee, on  1.Tilaa pizzan  2.Kutsuu toista konstruktoria",
            "Files luokan kaikki metodit ovat staattisia  1. Kyllä  2. Ei",
            "Thrown 'vastapari' on 1. catch  2. tryHarder"};

    private static List<String> kysymyksetListassa = Arrays.asList(kysymykset);
    private static Map<String, String> kartta = new HashMap<>();

    public static void main(String[] args) {
        int pisteet = 0;

        kartta.put(kysymykset[0], "1");
        kartta.put(kysymykset[1], "1");
        kartta.put(kysymykset[2], "2");
        kartta.put(kysymykset[3], "1");
        kartta.put(kysymykset[4], "2");
        kartta.put(kysymykset[5], "2");
        kartta.put(kysymykset[6], "1");
        kartta.put(kysymykset[7], "2");
        kartta.put(kysymykset[8], "1");
        kartta.put(kysymykset[9], "1");
        kartta.put(kysymykset[10], "2");
        kartta.put(kysymykset[11], "1");
        kartta.put(kysymykset[12], "2");
        kartta.put(kysymykset[13], "2");
        kartta.put(kysymykset[14], "1");
        kartta.put(kysymykset[15], "2");
        kartta.put(kysymykset[16], "2");
        kartta.put(kysymykset[17], "2");
        kartta.put(kysymykset[18], "1");
        kartta.put(kysymykset[19], "1");

        System.out.println("Aaaaa juuu redii?");

        Collections.shuffle(kysymyksetListassa);

        for (int i = 0; i < 10;) {
            String kyssari = kysymyksetListassa.get(i);
            System.out.println(kyssari);
            if (lukija.hasNextLine()) {
                String vastaus = lukija.nextLine();
                if (vastaus.equals("1") || vastaus.equals("2")) {
                    if (vastaus.equals(kartta.get(kyssari))) {
                        pisteet++;
                        i++;
                        System.out.println("Oikein!");
                        System.out.println();
                    } else {
                        i++;
                        System.out.println("Väärin");
                        System.out.println();
                    }
                } else {
                    System.out.println("Vastauksen pitää olla 1 tai 2");
                    continue;
                }
            }else {
                System.out.println("Vastauksen pitää olla 1 tai 2");
                lukija.next();
            }
        }
        System.out.println("Peli loppui");
        System.out.println("Onneksi olkoon, sait " + pisteet + " pistettä!!");
    }
}