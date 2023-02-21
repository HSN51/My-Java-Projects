import java.util.Scanner;
public class ÇinZodyağıHesaplama {

        public static void main(String args[]) {

                int dogumYili;

                Scanner input = new Scanner(System.in);

                do {
                        System.out.println("Doğum Yılınızı Giriniz : ");
                        dogumYili = input.nextInt();

                        if (dogumYili % 12 == 0){
                                System.out.println("Zodyak burcunuz : Maymun ");
                        } else if (dogumYili % 12 == 1) {
                                System.out.println("Zodyak burcunuz : Horoz");
                        }else if (dogumYili % 12 == 2) {
                                System.out.println("Zodyak burcunuz : Köpek");
                        } else if (dogumYili % 12 == 3) {
                                System.out.println("Zodyak burcunuz : Domuz");
                        } else if (dogumYili % 12 == 4) {
                                System.out.println("Zodyak burcunuz : Fare");
                        } else if (dogumYili % 12 == 5) {
                                System.out.println("Zodyak burcunuz : Öküz");
                        } else if (dogumYili % 12 == 6) {
                                System.out.println("Zodyak burcunuz : Kaplan");
                        } else if (dogumYili % 12 == 7) {
                                System.out.println("Zodyak burcunuz : Tavşan");
                        } else if (dogumYili % 12 == 8) {
                                System.out.println("Zodyak burcunuz : Ejderha");
                        } else if (dogumYili % 12 == 9) {
                                System.out.println("Zodyak burcunuz : Yılan");
                        } else if (dogumYili % 12 == 10) {
                                System.out.println("Zodyak burcunuz : At");
                        } else if(dogumYili % 12 == 11){
                                System.out.println("Zodyak burcunuz : Koyun");
                        }


                }while (dogumYili > 0);


        }




}
