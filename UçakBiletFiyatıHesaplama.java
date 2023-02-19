import java.util.Scanner;
public class UçakBiletFiyatıHesaplama {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);

       int yas,tip,ucret,mesafe;
       double normalsum,yasIndirim,gidisDonus = 0,indirimlisum,toplamsum;

        System.out.println("Mesafeyi km olarak giriniz : ");
        mesafe = inp.nextInt();

        if (mesafe > 0){
            System.out.println("Yaşınızı giriniz : ");
            yas = inp.nextInt();

            if (yas > 0){
                System.out.println("Merhaba, Lütfen Yolculuk tipi giriniz : \n1-Tek Yön\n2-Gidiş-dönüş");
                tip = inp.nextInt();

                if (tip > 0 && tip <= 2){
                    switch (tip){
                        case 1:
                            if (yas < 12){
                                normalsum = mesafe * 0.10;
                                yasIndirim = normalsum - (normalsum * 0.50);
                                System.out.println("Toplam tutar : " + yasIndirim);
                            }else if ((yas >= 12) && (yas<=24)){
                                normalsum = mesafe * 0.10;
                                yasIndirim = normalsum - (normalsum * 0.10);
                            System.out.println("Toplam tutar : " + yasIndirim);
                            }else if (yas > 65){
                                normalsum = mesafe * 0.10;
                                yasIndirim = normalsum - (normalsum * 0.20);
                                System.out.println("Toplam tutar : \" + yasIndirim");
                        }else {
                                normalsum = mesafe * 0.10;
                            System.out.println("Toplam tutar : " + normalsum);
                        }
                        break;

                        case 2:
                            if (yas < 12){
                                normalsum = mesafe * 0.10;
                                yasIndirim = normalsum - (normalsum * 0.50);
                                gidisDonus = yasIndirim - (yasIndirim * 0.20);
                                indirimlisum = gidisDonus * 2;
                                System.out.println("Toplam tutar : " + indirimlisum);
                            }else if ((yas >= 12) && (yas<=24)){
                                normalsum = mesafe * 0.10;
                                yasIndirim = normalsum - (normalsum * 0.10);
                                gidisDonus = yasIndirim - (yasIndirim * 0.20);
                                indirimlisum = gidisDonus * 2;
                                System.out.println("Toplam tutar : " + indirimlisum);
                            }else if (yas > 65){
                                normalsum = mesafe * 0.10;
                                yasIndirim = normalsum - (normalsum * 0.20);
                                indirimlisum = gidisDonus * 2;
                                System.out.println("Toplam tutar : " + indirimlisum);
                            }else {
                                normalsum = mesafe * 0.10;
                                gidisDonus = normalsum - (normalsum * 0.20);
                                indirimlisum = gidisDonus * 2;
                                System.out.println("Toplam tutar : " + indirimlisum);
                        }
                        break;
                    }


                }else {
                    System.out.println("Hatalı değer girdiniz lütfen tekrar deneyiniz !  ");
                }
            }else {
                System.out.println("Hatalı değer girdiniz lütfen tekrar deneyiniz !");
            }
        }else {
            System.out.println("Hatalı değer girdiniz lütfen tekrar deneyiniz !");

        }



    }

}
