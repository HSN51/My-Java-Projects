import java.util.Scanner;
public class Hasan {
    public static void main(String[] args) {
        //Değişkenleri oluşturalım
        int a,b;
        double c;

        //Kullanıcıdan verilerimizi alalım
        Scanner girdi = new Scanner(System.in);
        System.out.print("1.kenarı giriniz :");
        a = girdi.nextInt();
        System.out.print("1.kenarı giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " +c);
    }
}
