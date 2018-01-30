package fi.academy;

import java.util.ArrayList;
import java.util.List;


public class LisääListaan {

    public static void main(String[] args) {
        List<Henkilö> nimiLista = new ArrayList<>();

        Henkilö Maija = new Henkilö("Maija", "meikäläinen", 22);
        Henkilö Unto = new Henkilö("Unto", "Olavi", 33);
        Henkilö Roosa = new Henkilö("Roosa", "Nauha", 16);
        Henkilö Otto = new Henkilö("Otto", "Farmari", 55);
        Henkilö Pequ = new Henkilö("Pequ", "Paqu", 28);

        nimiLista.add(Maija);
        nimiLista.add(Unto);
        nimiLista.add(Roosa);
        nimiLista.add(Otto);
        nimiLista.add(Pequ);
        nimiLista.add(new Henkilö("Sami","Eskelinen", 31));

        for (int i = 0; i < nimiLista.size(); i++) {
            System.out.println(nimiLista.get(i));
        }

        if (nimiLista.contains(Maija)) {
            System.out.println("kyllä");
        } else {
            System.out.println("ei");
        }

        int summa = 0;
        for (Henkilö henkilo : nimiLista){
            summa += henkilo.getIka();
        }
        System.out.println(summa);
    }
}