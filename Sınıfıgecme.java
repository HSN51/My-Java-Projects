import java.util.Scanner;
public class Sınıfıgecme {
    public static void main(String[] args) {

        int mat,turkce,fizik,kimya,muzik;

        Scanner input = new Scanner(System.in);


        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Turkce notunuz : ");
        turkce = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Muzik notunuz : ");
        muzik = input.nextInt();

        double average = (mat + turkce + fizik + kimya + muzik) / 5;

        if (average<=55){
            System.out.println("Sınıfta kaldınız,seneye tekrar görüşmek üzere ! ");
        }else {
            System.out.println("Tebrikler sınıfı geçtiniz ! ");
        }

        System.out.println("Ortalamanız : " + average);


    }
}
