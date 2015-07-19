package c1;

public class If03 {
    // The if statement

    public static void main(String[] args) {
        int x = 10;

        if (x == 10) {
            System.out.println("yes, x is 10");
            System.out.println("hello");
            int z = 43;
            System.out.println(z);
        }

        if (x == 1) {
            System.out.println("no way");
        }

        int y = 4;
        if (y > 0) {
            System.out.println("y is positive.");
        }

        if (x == 1) {
            System.out.println("x is one");
        } else {
            System.out.println("x is something else");
        }

        if (x == 10 && y == 4) {
            System.out.println("all matches");
        } else {
            System.out.println("either x != 10 or y != 4");
        }
    }
}
