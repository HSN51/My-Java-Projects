import java.util.Scanner;

public class RecursiveMetotlarileÜslüSayıHesaplama {

    static int power(int a,int b){
        int result = 1;

        for (int i = 1;i <= b;i++){
            result *= a;
        }
        return result;
    }


    public static void main(String[] args) {

        int a,b;

        Scanner cd = new Scanner(System.in);
        while (true) {
            System.out.print("Taban değeri giriniz : ");
            a = cd.nextInt();

            System.out.print("Üs değerini giriniz : ");
            b = cd.nextInt();

            System.out.println("Sonuç  :" + power(a, b));
        }


    }
}
