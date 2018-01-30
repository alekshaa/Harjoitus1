package fi.acedemy;

public class Lasku {
    public static void main(String[] args){
        String tulos;
        try{
            tulos = jakolasku(args);
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Annahan parametreja");
        }catch (NumberFormatException ex){
            System.out.println("Ei ollut lukuja");
        }catch (ArithmeticException ex){
            System.out.println("Nollalla jako ei sallittu");
        }

    }

    public static String jakolasku(String[]args) {
        int luku1 = Integer.parseInt(args[0]);
        int luku2 = Integer.parseInt(args[1]);
        int tulos = luku1 / luku2;
        return String.format("%d / %d = %d", luku1, luku2, tulos);
    }
}
