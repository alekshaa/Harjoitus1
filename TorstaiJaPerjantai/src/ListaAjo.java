import java.util.List;

public class ListaAjo {

    public static void main(String[] args) {
        List<Henkilö> kaikki = HenkiloLista.haeKaikki();
        System.out.println(kaikki);

        kaikki.add(new Henkilö("Riikka", "Isompi", 32));
        System.out.println(kaikki);

        List<Henkilö> toinen = HenkiloLista.haeKaikki();
        System.out.println("Toinen: ");
        System.out.println(toinen);
    }
}
