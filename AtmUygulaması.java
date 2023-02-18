import java.util.Scanner;
public class AtmUygulaması {
    public static void main(String[] args) {

        int balance = 1500;

        int counter = 3;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        String userName = input.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        String password = input.nextLine();

        if ((userName.equals("patika")) && (password.equals("123"))) {
            System.out.println("Merhaba ,Kodluyoruz bankasına hoşgeldiniz ! ");
            int select;
            do {
                System.out.println("1-Para Yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgulama\n" +
                        "4-Çıkış yap");

                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();


                switch (select) {

                    case 1:
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                        System.out.println("Yeni bakiyeniz : " + balance);
                        break;
                    case 2:
                        System.out.print("Para miktarı :");
                        price = input.nextInt();

                        if (price > balance) {
                            System.out.print("Bakiye yatersiz ! ");
                        } else {
                            balance -= price;
                            System.out.print("Yeni bakiyeniz : " + balance);
                        }
                        break;
                    case 3:
                        System.out.print("Bakiyeniz : " + balance);
                        break;
                    case 4:
                        System.out.println("Kodluyoruz bankası olarak İyi günler dileriz ! ");
                }
            } while (select != 4);

        }else {

            counter--;
            System.out.print("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");

            if (counter == 0 ){
                System.out.print("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
            }else {
                System.out.print("Kalan hakkınız : " + counter);
            }


        }



    }

}