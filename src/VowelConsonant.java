import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Alphabet");
        char x=sc.next().charAt(0); //x stores the entered alphabet
        if (!Character.isLetter(x)) {
            System.out.println("Please enter a valid alphabet.");
            return;
        }
        else {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
                System.out.println(x + " is a vowel");
            } else {
                System.out.println(x + " is a consonant");
            }
        }
    }
}
