import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if (n<31 && n>=0) {
            System.out.println("Valid Input");
            for (int i = 0; i < n; i++) {
                double pow = Math.pow(2, i);
                System.out.println(pow);
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}
