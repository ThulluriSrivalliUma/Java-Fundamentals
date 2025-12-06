package Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeWageComputationProblem {
    public static void main(String[] args) {
        System.out.println("Employee Wage Computation Program on Master Branch");
        Employee emp = new Employee();
        emp.checkAttendance();
        emp.calculateMonthlyWage();
    }
    public static class Employee{
        int attendance;
        final int WAGES_PER_HOUR=20;
        final int FULL_DAY_HOUR =8;
        final int PART_DAY_HOUR =8;
        final int WORKING_DAYS_PER_MONTH =20;
        final int MAX_HOURS =100;
        Random rand= new Random();
        List<Integer> dailyAttendance = new ArrayList<>();
        public void checkAttendance() {
            attendance= rand.nextInt(2); // generates either 0 or 1
            if (attendance==1) {
                System.out.println("Employee is present");
            } else {
                System.out.println("Employee is absent");
            }
        }
        public int dailyEmployeeWage(int work) {
            int hours= 0;
            switch (work) {
                case 1: // full-time
                    hours= FULL_DAY_HOUR;
                    break;
                case 2: // part-time
                    hours= PART_DAY_HOUR;
                    break;
                default:
                    hours=0;// absent
            }
            return hours*WAGES_PER_HOUR; //calculates daily employee wage
        }
        public void calculateMonthlyWage() {
            int totalWage=0;
            int totalHours=0;
            int totalDays=0;
            while(totalHours< MAX_HOURS -4 && totalDays< WORKING_DAYS_PER_MONTH) {
                totalDays++;
                int workType= rand.nextInt(3); // 0=absent, 1=full time, 2=part time
                dailyAttendance.add(workType);
                int dailyWage= dailyEmployeeWage(workType);
                totalWage+=dailyWage;
                if (workType==1) {
                    totalHours += FULL_DAY_HOUR; // updating the working hours of the full time employee
                }
                else if(workType==2){
                    totalHours += PART_DAY_HOUR; // updating the working hours of the part time employee
                }
            }
            System.out.println("Employee daily work type: \n 0: Employee is absent \n 1: Employee has worked full day \n 2: Employee has worked for part time");
            System.out.println("Day\t\tWork type");
            System.out.println("-------------------");
            for(int i=0;i<dailyAttendance.size();i++) {
                System.out.println((i + 1) + "\t\t" + dailyAttendance.get(i));
            }
            System.out.println("Total Wage for the month = " + totalWage);
            System.out.println("Total Working Days = "+totalDays+", Total Working Hours = "+totalHours);
        }
    }
}

