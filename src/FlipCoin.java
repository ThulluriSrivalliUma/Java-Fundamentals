import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FlipCoin {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    // We denote the number of flips by n
    // We have declared the variable but we have not assigned any value to it
    int n;
    // We denote t for tails and h for heads
    int t=0;
    int h=0;
    System.out.println("Enter the number of flips");
    n=sc.nextInt();
    if(n>=0){
        System.out.println("Entered number is a positive");
    }
    else{
        System.out.println("Entered number is not positive. Terminating the code");
        System.exit(0);
    }
    for (int i=1; i<=n; i++){
        double generate= Math.random();
        System.out.println(generate);
            if (generate <0.5){
                t=t+1;
            }
            else{
                h=h+1;
            }
    }
    System.out.println("No of heads= "+h);
    System.out.println("No of tails= "+t);
    double headpercent=(double)h/n*100;
    double tailpercent=(double)t/n*100;
    System.out.println("Heads percentage is: "+headpercent+" Vs "+"Tails percentage is: "+tailpercent);
    }
}

