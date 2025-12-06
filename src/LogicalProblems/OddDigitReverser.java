package LogicalProblems;

import java.util.Scanner;

public class OddDigitReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String num= sc.nextLine(); //num will store the number but in string format
        int len= num.length();
        String reversed="";
        for(int i=len-1;i>=0;i--){
            int digit = num.charAt(i)-'0'; //converting string to integer
            if(digit%2!=0){
                reversed+=digit;
            }
        }
        System.out.println(reversed);
    }
}