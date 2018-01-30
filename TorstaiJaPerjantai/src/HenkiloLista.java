import java.util.ArrayList;
import java.util.List;

public abstract class HenkiloLista {
    private static List<Henkilö> lista = new ArrayList<>();

    static {
        lista.add(new Henkilö("Tara", "Pieni", 16));
    }

    public static Henkilö haeNimella(String etunimi){
        return null;
    }

    public static List<Henkilö> haeKaikki(){
        return new ArrayList<>(lista);
    }

    public static void lisaaHenkilo(Henkilö uusi){
        lista.add(uusi);
    }
}
