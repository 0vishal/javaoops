import java.util.Scanner;

public class EmpwageBuilder {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Welcome to Employee wage computation problem on master branch");

        Employee emp = new Employee();

        emp.EMPWAGEPERHOUR = 20;
        emp.DAYS_IN_MONTH = 20;
        emp.MAX_HOURS = 100;
        emp.wage();

    }
}
    class Employee {
            int EMPWAGEPERHOUR;
            int EMPTIME;
            int DAYS_IN_MONTH;
            int MAX_HOURS;
            int day, hours;

            void wage() {


                while(day < DAYS_IN_MONTH && hours != MAX_HOURS) {
                    int TIME = (int) Math.floor(Math.random() * 10) % 3;


                    switch (TIME) {
                        case 1:
                            EMPTIME = 8;
                            break;
                        case 2:
                            EMPTIME = 4;
                            break;
                        default:
                            EMPTIME = 0;
                    }
                    day = day+1;
                    hours = hours+EMPWAGEPERHOUR;
                    int DAILYWAGE = (EMPTIME * EMPWAGEPERHOUR);
                    System.out.println("Daily wage is " + DAILYWAGE);
                    int MONTHLYWAGE = (DAYS_IN_MONTH * DAILYWAGE);

                    System.out.println("Monthly wage is " + MONTHLYWAGE);

                }

            }

        }











































