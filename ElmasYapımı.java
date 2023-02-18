import java.util.Scanner;
public class ElmasYapımı {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = 9;

        for (int a = 1; a < 9;a++){
            for (int b = 1; b <= (9 - a);b++){
                System.out.print(" ");
            }
            for (int c = 1;c <= 2*a-1;c++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 9; i >= 1 ;i--){
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
