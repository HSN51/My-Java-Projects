import java.util.Scanner;
public class MinMaxDeğerleriBulma {
    public static void main(String[] args) {
        int number,input2,max = 0,min = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç tane sayı gireceksiniz :");
        number = input.nextInt();

        for (int i = 1;i <= number ; i++){

            System.out.println(i + ". sayıyı giriniz : ");
            input2 = input.nextInt();

            if (i == 1){
                max = input2;
                min = input2;
            }

            if (max < input2){
                max = input2;
            }

            if (min > input2){
                min = input2;
            }




        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }

}
