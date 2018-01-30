import java.util.*;

public class Viikonpaiva {
    static String[] viikko = new String[]{"maanantai", "tiistai", "keskiviikko", "torstai", "perjantai", "lauantai", "sunnuntai"};

    public static void main(String[] args) {
        List<String> lista = Arrays.asList(viikko);
        System.out.println(lista);

        Collections.rotate(lista, 1);
        System.out.println(lista);

        Collections.sort(lista);
        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals("torstai")){
                lista.set(i, "Torstai");
            }
        }
        System.out.println(lista);

        Collections.sort(lista);
        System.out.println(lista);

        Collections.shuffle(lista);
        System.out.println(lista);

        List<String> uusiLista = new ArrayList<>(lista);
        uusiLista.add(0, "alapäivä");
        lista = uusiLista;
        System.out.println(lista);

        Collections.sort(lista);
        System.out.println(lista);

        Collections.sort(lista, new Vertailija());
        System.out.println(lista);
    }
}

