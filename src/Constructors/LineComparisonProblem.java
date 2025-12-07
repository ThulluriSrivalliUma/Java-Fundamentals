package Constructors;

import java.util.Scanner;

public class LineComparisonProblem {
    public static void main(String[] args){
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first Line : (x1 y1) (x2 y2)");
        int x1= sc.nextInt();
        int y1= sc.nextInt();
        int x2= sc.nextInt();
        int y2= sc.nextInt();
        System.out.println("Enter the coordinates of the Second Line : (x3 y3) (x4 y4)");
        int x3= sc.nextInt();
        int y3= sc.nextInt();
        int x4= sc.nextInt();
        int y4= sc.nextInt();
        Line line1 = new Line(x1, y1, x2, y2);
        Line line2 = new Line(x3, y3, x4, y4);
        Double line1Length = line1.getLength();
        Double line2Length = line2.getLength();
        if (line1Length.equals(line2Length)) {
            System.out.println("Line 1 and Line 2 are equal.");
        } else {
            System.out.println("Line 1 and Line 2 are not equal.");
        }
        int comparison = line1Length.compareTo(line2Length);
        if (comparison > 0) {
            System.out.println("Line 1 is longer than Line 2.");
        } else if (comparison < 0) {
            System.out.println("Line 1 is shorter than Line 2.");
        } else {
            System.out.println("Line 1 and Line 2 are equal in length.");
        }
    }
    static class Line {
        int x1, y1, x2, y2;
        public Line(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
        public Double getLength() {
            return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }
}
}
