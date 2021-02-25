import java.util.Scanner;

public class Linecompare {

   import java.util.*;

import java.util.Objects;
import java.util.Scanner;

public class LinecomparisonUC1 {

    public static void main(String[] args) {
        System.out.println("Welcome to line comparison computation program on master branch");
        System.out.println("We will calculate length of line s1 t1 s2 t2 ");


        Linecalculate lineone = new Linecalculate();
        System.out.println(lineone.calculate());


        System.out.println("We will calculate length of line p1 q1 p2 q2 ");
        Linecalculate linetwo = new Linecalculate();
        System.out.println(linetwo.calculate());

        
        int lengthL1= lineone.calculate();
        int lengthL2 = linetwo.calculate();

        int Equals= lengthL1.equals(lengthL2);
        if (Equals== True){
            System.out.println("Lines are equal ");
        }
        else
            System.out.println("Lines are not equal");

    }
    }

class Linecalculate {

        public int calculate() {

            Scanner scan = new Scanner(System.in);
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            int len = (int)Math.floor(Math.sqrt((x2-x1)^2+(y2-y1)^2));
            System.out.println(len);
            return len;
    }
}
