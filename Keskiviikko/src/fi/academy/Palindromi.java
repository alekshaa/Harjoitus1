package fi.academy;

public class Palindromi {

    public static void main(String[] args) {
        Palindromi palindromi = new Palindromi();
        String teksti = palindromi.lueTeksti();
        boolean onko = palindromi.onkoPalindromi2(teksti);
        if (onko){
            System.out.println(teksti + " on palindromi");
        }else {
            System.out.println(teksti + " ei ole palindromi");
        }
    }

    public String lueTeksti() {

        return "saippuakauppias";
    }

    public boolean onkoPalindromi1(String kandidaatti){
        StringBuilder kopio = new StringBuilder(kandidaatti);
        if (kandidaatti.equalsIgnoreCase(kopio.reverse().toString()))
            return true;
        return false;
    }

    public boolean onkoPalindromi2(String kandidaatti){
        kandidaatti = kandidaatti.toLowerCase();

        for (int i = 0; i < kandidaatti.length() / 2; i++){
            char alku = kandidaatti.charAt(i);
            char loppu = kandidaatti.charAt(kandidaatti.length()-(i+1));
            if (alku != loppu){
                return false;
            }
        }
        return true;
    }
}