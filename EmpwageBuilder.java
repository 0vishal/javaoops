import java.util.Scanner;

public class EmpwageBuilder {

public static void main(String[] args) {
        // write your code here

        System.out.println("Welcome to Employee wage computation problem on master branch");

        Employee emp = new Employee();

        emp.EMPWAGEPERHOUR = 20;
        emp.DAYS_IN_MONTH = 20;
        emp.wage();

    }
}
        class Employee {
            int EMPWAGEPERHOUR;
            int EMPTIME;
            int DAYS_IN_MONTH;

            void wage() {

                System.out.println("Calculate wage 1.FullTime 2.PartTime");
                Scanner scan = new Scanner(System.in);
                int TIME = scan.nextInt();

                switch (TIME) {
                    case 1:
                        EMPTIME = 8;
                        break;
                    case 2:
                        EMPTIME = 4;
                        break;
                }
                int DAILYWAGE = (EMPTIME * EMPWAGEPERHOUR);
                System.out.println("Daily wage is " + DAILYWAGE);
                int MONTHLYWAGE = (DAYS_IN_MONTH * DAILYWAGE);

                System.out.println("Monthly wage is " + MONTHLYWAGE);


            }

        }































