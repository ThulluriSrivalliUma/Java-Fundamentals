import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Year is denoted by y
        System.out.println("Enter the Year: ");
        int y= sc.nextInt();
        if(y>999 && y<10000){
            System.out.println("Year is Valid");
            if(y%4==0){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not a Leap Year");
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}
