package LogicalProblems;

import java.util.Arrays;
import java.util.Scanner;

public class StudentRankListGenerator {
    public static void main(String[] args){
        int[] arr;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n= sc.nextInt();
        arr= new int[n];
        System.out.println("Enter the students Ranks: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int j=1;
        for(int i=(n-1);i>=0;i--){
            System.out.println(j+". "+arr[i]);
            j=j+1;
        }
    }
}
