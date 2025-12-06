package LogicalProblems;

import java.util.Scanner;

public class CustomPasswordEncoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Password: ");
        String pass= sc.nextLine().toUpperCase(); //pass stores tha password
        int len=pass.length();
        String encoded = "";
        for (int i=0;i<len;i++) {
            char c = pass.charAt(i);
            if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
                encoded += '@';
            }
            else if (Character.isDigit(c)&&(c-'0')%2==0) {
                encoded += '*';
            }
            else {
                encoded += c;
            }
        }
        System.out.println("Encoded Password: " + encoded);
    }
}
