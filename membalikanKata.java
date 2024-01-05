import java.util.Scanner;

public class membalikanKata {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // input
        String kata = in.nextLine();
        String balik = " ";
        char huruf;

        // penyelesaian
        for (int i = 0; i < kata.length(); i++) {
            huruf = kata.charAt(i);
            balik = huruf + balik;
        }
        System.out.println(balik);

    }
}