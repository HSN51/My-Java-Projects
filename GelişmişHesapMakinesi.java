import java.util.Scanner;
public class GelişmişHesapMakinesi {

    static int sum(int a,int b){
        int result = a + b;
        System.out.println("Toplam : " + result);
        return a + b;
    }

    static int minus(int a,int b){
        int result = a - b;
        System.out.println("Çıkarma  : " + result);
        return a - b;
    }

    static int times(int a,int b){
        int result = a - b;
        System.out.println("Çarpma  : " + result);
        return a * b;
    }

    static int divided(int a,int b){

        if (b == 0){
            return  0;
        }

        int result = a / b;
        System.out.println("Bölüm  : " + result);
        return a / b;
    }
    static int power(int a,int b){
        int result = 1;
        for (int i = 1;i <= b; i++){
            result *=a;
        }
        System.out.println("Üs alma sonucu : " + result);
        return result;
    }

    static int mod(int a,int b){
        int result = a % b;
        System.out.println("Mod  : " + result);
        return a % b;
    }

    static void calc(int a, int b){
        System.out.println("Çevresi  : " + (2*(a+b)));
        System.out.println("Alanı : " + (a*b));

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n";

        while (true){
            System.out.println(menu);
            System.out.print("İşlem numarasını seçiniz : ");
            select = input.nextInt();

            if (select == 0){
                System.out.print("Yanlış bir seçme Lütfen tekrar deneyiniz!");
            }

            System.out.print("İlk sayıyı giriniz : ");
            int a = input.nextInt();
            System.out.print("İkinci sayıyı girniz :  ");
            int b = input.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    calc(a,b);
                    break;
            }
        }



    }

}
