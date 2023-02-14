
package Giris;
import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);
        System.out.println("Dairenin yaricapini giriniz : ");
        r = inp.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin cevresi : " + cevre);
    }
}
