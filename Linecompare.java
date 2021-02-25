import java.util.Scanner;

public class Linecompare {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to line comparison computation program on master branch");
        System.out.println("We will calculate length of line x1 y1 x2 y2 ");
        Scanner scan = new Scanner(System.in);

        Linecalculate lineone = new Linecalculate();
        lineone.x1 = scan.nextInt();
        lineone.y1 = scan.nextInt();
        lineone.x2 = scan.nextInt();
        lineone.y2 = scan.nextInt();
        lineone.Linecalculate();
    }
}

class Linecalculate {
    int x1, y1, x2, y2;

    void Linecalculate() {
        double len = Math.sqrt((x2-x1)^2+(y2-y1)^2);
        System.out.println(len);
    }
}