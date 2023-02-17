import java.util.Scanner;
public class FaktöriyelHesaplama {
    public static void main(String[] args) {

        int n;

        Scanner inp = new Scanner(System.in);
        System.out.print("Faktöriyel sayısı : ");
        n = inp.nextInt();
        int total = 1;

        for (int i = 1;i<=n;i++){
            total = total * i;

        }
        System.out.println("Faktöriyel : " + total);

    }
}
