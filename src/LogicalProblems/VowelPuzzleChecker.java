package LogicalProblems;

import java.util.Scanner;

public class VowelPuzzleChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase();
        int len = word.length();
        int vowelCount = 0;
        char firstletter = word.charAt(0);
        char lastletter = word.charAt(len - 1);
        if ((firstletter=='A'||firstletter=='E'||firstletter=='I'||firstletter=='O'||firstletter=='U')
                && (lastletter=='A'||lastletter=='E'||lastletter=='I'||lastletter=='O'||lastletter=='U')) {
            for (int i=0;i<len;i++) {
                char c = word.charAt(i);
                if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
                    vowelCount++;
                }
            }
            if (vowelCount == 4) {
                System.out.println("Valid");
            }
            else {
                System.out.println("Invalid");
            }
        }
        else {
            System.out.println("Invalid");
        }
    }
}