package LogicalProblems;

import java.util.Scanner;

public class BusSeatAllotmentSimulator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int totalSeats= 40;
        boolean[] bookedSeats= new boolean[totalSeats + 1];
        System.out.println("Enter the number of seats: ");
        int[] seat;
        int n= sc.nextInt();
        seat= new int[n];
        for (int i=0;i<n;i++) {
            seat[i]= sc.nextInt();
        }
        for (int i=0;i<n;i++) {
            int temp= seat[i]; //temp stores the seat number from the array
            if (temp<1||temp>totalSeats) {
                System.out.println("Enter the correct seat number");
                continue;
            }
            if (bookedSeats[temp]) {
                System.out.println("Seat " +temp+ " Already Booked");
            }
            else {
                bookedSeats[temp] = true;
                System.out.println("Seat " +temp+ " Booked");
            }
        }
    }
}

