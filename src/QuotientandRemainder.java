import java.util.Scanner;

public class QuotientandRemainder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dividend number: ");
        int m= sc.nextInt();//m store dividend number
        System.out.println("Enter the divisor number: ");
        int n= sc.nextInt();//n store divisor number
        int quotient=m/n;
        int remainder=m%n;
        System.out.println("Quotient when "+m+"/"+n+": "+quotient);
        System.out.println("Remainder when "+m+"/"+n+": "+remainder);
    }
}
