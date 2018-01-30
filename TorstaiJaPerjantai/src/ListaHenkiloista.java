import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListaHenkiloista {
    private static Henkilö[]hlot= {
            new Henkilö("John", "Doe", 21),
            new Henkilö("Jane", "Doe", 28),
            new Henkilö("John", "Doe", 55),
            new Henkilö("John", "Deere", 21),
            new Henkilö("James", "Gosling", 55)
    };

    public static void main(String[] args) {
        List<Henkilö> lista = Arrays.asList(hlot);
        System.out.println(lista);

        Collections.sort(lista);
        System.out.println(lista);

        Collections.sort(lista, new IkaVertailija());
        System.out.println(lista);

        Collections.sort(lista, new EtunimiVertailija());
        System.out.println(lista);

        Collections.sort(lista, new SukunimiVertailija());
        System.out.println(lista);
    }
}
