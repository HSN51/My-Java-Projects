import java.util.Scanner;
public class HesapMakinası {
    public static void main(String[] args) {
       int n1,n2,select;

       Scanner input = new Scanner(System.in);

        System.out.print("İlk sayiyi giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci sayiyi giriniz : ");
        n2 =  input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();

        switch (select){

            case 1:
                System.out.print("Toplama : " + (n1 + n2));


            case 2:
                System.out.print("Çıkarma : " + (n1 - n2));

            case  3:
                System.out.print("Çarpma : " + (n1 * n2));

            case 4:
                System.out.print("Bölme : " + (n1/n2));
        }
    }

}