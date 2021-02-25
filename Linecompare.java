import java.util.Scanner;

public class Linecompare {


        public static void main(String[] args) {
            System.out.println("Welcome to line comparison computation program on master branch");

            System.out.println("We will calculate length of line s1 t1 s2 t2 ");
            Linecalculate lineone = new Linecalculate();
            int length1 = lineone.calculate();
            System.out.println(length1);


            System.out.println("We will calculate length of line p1 q1 p2 q2 ");
            Linecalculate linetwo = new Linecalculate();
            int length2 = linetwo.calculate();
            System.out.println(length2);

            Linecalculate value = new Linecalculate();
            Integer obj1 = new Integer(length1);
            Integer obj2 = new Integer(length2);
            int VALUE = obj1.compareTo(obj2);
            value.compare(VALUE);


        }

        static class Linecalculate {

            public int calculate() {

                Scanner scan = new Scanner(System.in);
                int x1 = scan.nextInt();
                int y1 = scan.nextInt();
                int x2 = scan.nextInt();
                int y2 = scan.nextInt();
                int len = (int) Math.floor(Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2));
                System.out.println(len);
                return len;
            }

            public int compare(int result) {


                if (result == -1) {
                    System.out.println("Length of line1 is less than line2");
                } else if (result == 1) {
                    System.out.println("Length of line1 is greater than line2");
                } else {
                    System.out.println("Length of line1 is equal to line2");
                }
            return result;
            }
        }
    }
