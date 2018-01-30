public class Laskin {

    public static void main(String[] args){
        String tulos;
        try{
            System.out.println(jakolasku(args));
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Laita lukuja");
        }catch (ArithmeticException ex){
            System.out.println("Nollalla ei saa jakaa");
        }catch (NumberFormatException ex){
            System.out.println("Syötä luku numeroina");
        }
    }

    static String jakolasku(String[]args) {
        int luku1 = Integer.parseInt(args[0]);
        int luku2 = Integer.parseInt(args[1]);
        int tulos= luku1 / luku2;
        return String.format("%d / %d = %d", luku1, luku2, tulos);}
}
