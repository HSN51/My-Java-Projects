import java.util.Scanner;
public class Manavkasa {
    public static void main(String[] args) {

        double Armut,Elma,Domates,Muz,Patlican,toplamTutar;

        Scanner inp = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? : ");
        Armut = inp.nextDouble();

        System.out.println("Elma Kaç Kilo ? : ");
        Elma = inp.nextDouble();

        System.out.println("Domates Kaç Kilo ? : ");
        Domates = inp.nextDouble();

        System.out.println("Muz Kaç Kilo ? : ");
        Muz = inp.nextDouble();

        System.out.println("Patlıcan Kaç Kilo ? : ");
        Patlican = inp.nextDouble();

        toplamTutar = (Armut * 2.14 + Elma * 3.67 + Domates * 1.11 + Muz * 0.95 + Patlican * 5.00);
        System.out.println("Toplam Tutar : " + toplamTutar);



    }
}
