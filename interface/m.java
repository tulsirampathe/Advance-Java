import java.util.*;

interface shape {
    public void calculateArea();

    public void claculatePerimeter();
}

class circle implements shape {

    float r = 2;

    public void calculateArea() {
        System.out.println("Area of circle : " + (3.14 * r * r));
    }

    public void claculatePerimeter() {
        System.out.println("Parameter of circle : " + (2 * 3.14 * r));
    }
}

class rec implements shape {
    int l = 2;
    int w = 5;

    public void calculateArea() {
        System.out.println("Area of Rectangle : " + (l * w));
    }

    public void claculatePerimeter() {
        System.out.println("Parameter of Rectangel : " + (2 * l + w));
    }
}

class trangle implements shape {
    int a = 2, b = 3, c = 1;
    int h = 2, w = 5;

    public void calculateArea() {
        System.out.println("Area of Trangle : " + (0.5 * h * w));
    }

    public void claculatePerimeter() {
        System.out.println("Parameter of Rectangel : " + (a + b + c));
    }
}

public class m {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        circle c = new circle();
        rec r = new rec();
        trangle t = new trangle();

        System.out.println("1. Area and Parameter of Circle");
        System.out.println("2. Area and Parameter of Ractangle");
        System.out.println("3. Area and Parameter of Trangle");

        int n = in.nextInt();

        if (n == 1) {
            c.calculateArea();
            c.claculatePerimeter();
        } else if (n == 2) {
            r.calculateArea();
            r.claculatePerimeter();
        } else if (n == 3) {
            t.calculateArea();
            t.claculatePerimeter();
        } else {
            System.out.println("Wrong Input");
        }

    }
}
