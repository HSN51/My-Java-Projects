import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        double Boy , Kilo;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");

        Boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");

        Kilo = inp.nextDouble();

        double Vucut_kitle_indeks =  Kilo  / Boy * Boy;


        System.out.print("Vücut Kitle İndeksiniz : " + Vucut_kitle_indeks);



    }
}
