package fi.acedemy;
import fi.acedemy.harjoitukset.Henkilö;

public class HenkiloTest {

    public static void main(String[] args){
        Henkilö[]hlot= {
                new Henkilö("John", "Doe", 21),
                new Henkilö("Jane", "Doe", 28),
                new Henkilö("John", "Doe", 55),
                new Henkilö("John", "Deere", 21),
                new Henkilö("James", "Gosling", 55)
        };
        for(Henkilö h: hlot) {
            System.out.println(h);
        }
        Henkilö john = new Henkilö("John", "Doe", 21);
        System.out.println(hlot[0] == john); // false
        System.out.println(hlot[0].equals(john)); // true
    }
}
