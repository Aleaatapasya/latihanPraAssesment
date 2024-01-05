import java.util.Scanner;

public class logaritma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // input data
        int hasil = in.nextInt();
        int basis = in.nextInt();

        // penyelesaian
        int pangkat = 1;
        while (hasil > basis) {
            hasil = hasil / basis;
            pangkat++;
        }
        System.out.println(pangkat);
    }
}
