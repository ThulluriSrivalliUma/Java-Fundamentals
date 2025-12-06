package LogicalProblems;

import java.util.Scanner;

public class PalindromeSlotMachine {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 - digit number: ");
        int n= sc.nextInt(); //n stores the 3 digit number
        int num=n;
        int rev=0;
        int sum=0; // sum of the three digit number
        while(num != 0){
            int digit= num%10;
            rev= rev*10+digit;
            num= num/10;
            sum= sum+digit;
        }
        if (rev==n && (sum%3==0)){
            System.out.println("Jackpot!");
        }
        else{
            System.out.println("Better Luck next time!");
        }
    }
}
