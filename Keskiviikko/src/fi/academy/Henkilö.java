package fi.academy;

public class Henkilö {
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

}
