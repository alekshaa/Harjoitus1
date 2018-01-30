import java.util.Comparator;

public class Henkilö implements Comparable<Henkilö>{
    private String etunimi;
    private String sukunimi;
    private int ika;

    public Henkilö(String etunimi, String sukunimi, int ika){
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.ika = ika;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        if(ika < 0) return;
        this.ika = ika;
    }

    public String toString(){
        return getEtunimi() + " " + getSukunimi() + " " + getIka();
    }

    public boolean equals(Object obj){
        if (obj == null) return false;
        Henkilö h = (Henkilö)obj;
        if (etunimi.equals(h.etunimi) && sukunimi.equals(h.sukunimi)){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Henkilö henkilö) {
        if (this.etunimi.compareTo(henkilö.etunimi) != 0){
            return this.etunimi.compareTo(henkilö.etunimi);
        }
        if (this.sukunimi.compareTo(henkilö.sukunimi) != 0){
            return this.sukunimi.compareTo(henkilö.sukunimi);
        }
        return this.ika - henkilö.ika;
    }
}

class IkaVertailija implements Comparator<Henkilö>{
    @Override
    public int compare(Henkilö henkilö, Henkilö t1) {
        return henkilö.getIka()-t1.getIka();
    }
}

class EtunimiVertailija implements Comparator<Henkilö>{
    @Override
    public int compare(Henkilö henkilö, Henkilö t1) {
        return henkilö.getEtunimi().compareTo(t1.getEtunimi());
    }
}

class SukunimiVertailija implements Comparator<Henkilö>{
    @Override
    public int compare(Henkilö henkilö, Henkilö t1) {
        return henkilö.getSukunimi().compareTo(t1.getSukunimi());
    }
}
