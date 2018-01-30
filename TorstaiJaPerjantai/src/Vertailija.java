import java.util.Comparator;

public class Vertailija implements Comparator<String>{
    public int compare(String a, String b) {
        int paluuarvo = a.length()-b.length();
        return paluuarvo;
    }
}
