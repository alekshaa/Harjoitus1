import java.util.*;

public class HenkiloKartta {
    private static Map<String, List<Henkilö>> henkiloMap = new TreeMap<>();
    public static Henkilö[]hlot= {
            new Henkilö("John", "Doe", 21),
            new Henkilö("Jane", "Doe", 28),
            new Henkilö("John", "Doe", 55),
            new Henkilö("John", "Deere", 21),
            new Henkilö("James", "Gosling", 55)
    };

    public static void main(String[] args) {
        for (Henkilö h : hlot){
            if (henkiloMap.containsKey(h.getEtunimi())){
                List<Henkilö> lista = henkiloMap.get(h.getEtunimi());
                lista.add(h);
            }else{
                List<Henkilö> lista = new ArrayList<>();
                lista.add(h);
                henkiloMap.put(h.getEtunimi(), lista);
            }

        }
        System.out.println(henkiloMap );
    }
}
