import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double val=1;
        if (n>0){
            System.out.print("1/1 + ");
            for (int i=2;i<n;i++){
                System.out.print("1/"+i+" +");
                val=val+(double) 1/i;
            }

            System.out.print("1/"+n);
            val=val+(double) 1/n;
            System.out.println();
            System.out.println(val);
        }
    }
}
