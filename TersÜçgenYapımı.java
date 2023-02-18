import java.util.Scanner;
public class TersÜçgenYapımı {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
      int n = 10;
        for(int i = 10; i >= 1 ;i--){
            for (int j = 1; j <= (n-i) ; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i -1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
