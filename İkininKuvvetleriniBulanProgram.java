import java.util.Scanner;
public class İkininKuvvetleriniBulanProgram {
    public static void main(String[] args) {

        int n;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sınır sayıyı giriniz : ");
        n = inp.nextInt();

        for (int i = 1 ; i <= n ; i*=2){
            System.out.println(i);
        }


    }
}
