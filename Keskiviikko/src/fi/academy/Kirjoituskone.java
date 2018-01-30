package fi.academy;
import java.io.*;

public class Kirjoituskone {

    public static void main(String[] args) throws IOException {
        String s = null;

        while (!"".equals(s)) {
            s = new BufferedReader(new InputStreamReader(System.in)).readLine();
            FileWriter fw = new FileWriter("testiä.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(s);
            pw.close();
            fw.close();
        }
    }
}
