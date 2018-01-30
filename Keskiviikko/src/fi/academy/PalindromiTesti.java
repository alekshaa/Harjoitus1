package fi.academy;

public class PalindromiTesti {

    public static void main(String[] args) {
        String[] sanat = {"abba", "saippuakauppias", "sana", "", "Abba", "sana sanas"};
        Palindromi p = new Palindromi();
        for (String sana : sanat){
            System.out.printf("'%s' %s palindromi %n", sana, p.onkoPalindromi2(sana) ? "on" : "ei ole");
        }
    }

    private void foo(){
        // Ehto ? <jos_ehto_true> : <jos_ehto_false>
        // int suurempi = 2 < 3 ? 3 : 2
        int luku1 = 4, luku2 = 3;
        int pienempi = luku1 < luku2 ? luku1 : luku2;
    }
}
