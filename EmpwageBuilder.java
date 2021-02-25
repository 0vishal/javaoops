import java.util.Scanner;

public class EmpwageBuilder {

    public static void main(String[] args) {
       
        // write your code here

        System.out.println("Welcome to Employee wage computation problem on master branch");
        System.out.println("Calculate wage 1.FullTime 2.PartTime");
        Scanner scan = new Scanner(System.in);
        int TIME = scan.nextInt();

        Employee emp = new Employee();

        emp.EMPWAGEPERHOUR = 20;
        emp.wage();

    }
}
        class Employee {
            int EMPWAGEPERHOUR;
            int EMPTIME;
            int TIME;
            int DAILYWAGE;

            void wage() {
                int EMPTIME;

                if ( TIME == 1 )  {
                    EMPTIME = 8;
                } else {
                    EMPTIME = 4;
                }
                int DAILYWAGE = (EMPTIME * EMPWAGEPERHOUR);
                System.out.println("Daily wage is " + DAILYWAGE);
            }
        }


















