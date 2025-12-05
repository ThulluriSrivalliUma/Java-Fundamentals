import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        if(n%2 == 0){
            System.out.println("The entered number is Even number");
        }
        else{
            System.out.println("The entered number is Odd number");
        }
    }
}

