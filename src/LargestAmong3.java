import java.util.Scanner;

public class LargestAmong3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number:");
        int a=sc.nextInt(); //First number
        System.out.println("Enter the Second number:");
        int b=sc.nextInt(); //Second number
        System.out.println("Enter the Third number:");
        int c=sc.nextInt(); //Third number
        if(a>b && a>c){
            System.out.println(a+" is the Largest number among "+a+","+b+","+c);
        }
        else if(b>c){
            System.out.println(b+" is the Largest number among "+a+","+b+","+c);
        }
        else {
            System.out.println(c+" is the Largest number among "+a+","+b+","+c);
        }
    }
}
