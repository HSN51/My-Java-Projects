import java.util.Scanner;
public class KullanıcıGiris {
    public static void main(String[] args) {
        String userName,password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız ! ");

        }else {
            System.out.println("Bilgileriniz Yanlış !");
        }
    }

}