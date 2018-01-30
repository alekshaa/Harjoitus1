import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListastaPoistaminen {
    static List<String> lista = new LinkedList<>(); //LinkedList tuplasti hitaampi tapa
    //static List<String> lista = new ArrayList<>();
    static String[] viikonpaivat = new String[]{"Maanantai", "Tiistai", "Keskiviikko", "Torstai", "Perjantai", "Lauantai", "Sunnuntai"};

    public static void main(String[] args) {
        for (String paiva : viikonpaivat){
            lista.add(paiva);
        }
        System.out.println(lista);

        // Tehty iteraattorilla
        Iterator<String> iter = lista.iterator();
        while (iter.hasNext()){
            String alkio = iter.next();
            if (alkio.startsWith("T")){
                iter.remove();
            }else {
                System.out.println(alkio);
            }
        }
        //

        for (int i = 0; i < lista.size();) {
            if (lista.get(i).toLowerCase().startsWith("t")){
                lista.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            poistaTPaivat(lista.get(i));
        }
        System.out.println(lista);
    }
    public static void poistaTPaivat(String paiva){
        if (paiva.charAt(0) == 'T' || paiva.charAt(0) == 't'){
            lista.remove(paiva);
        }
    }
}
