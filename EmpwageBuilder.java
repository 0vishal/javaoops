import java.util.Scanner;

public class EmpwageBuilder {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to Employee wage computation problem on master branch");
        Employee emp = new Employee();


        emp.EMPWAGEPERHOUR = 20;
        emp.EMPDAILYHOUR = 8;
        emp.dailwage();

    }
}
        class Employee {
            int EMPWAGEPERHOUR;
            int EMPDAILYHOUR;

            void dailwage() {

                int DAILYWAGE = (EMPDAILYHOUR * EMPWAGEPERHOUR);
                System.out.println("Daily wage is " + DAILYWAGE);


            }
        }














