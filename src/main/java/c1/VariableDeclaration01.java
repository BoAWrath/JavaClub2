package c1;

public class VariableDeclaration01 {
    public static void main(String[] args) {
        // This is a comment, you can type what you want here, the compiler ignores it.


        //Declaring integer variables

  //  type   name     value
        int integer = 100;
        int another = 200;

        integer = 99;   //reassignment to existing variable

        int sumOfBoth = integer + another;

        int anotherSum = sumOfBoth + 1;


        System.out.println("Sum = " + sumOfBoth);

        //declaring float/double variables

        double d1 = 1.5;
        float d2 = 1.0f;

        double dSum = d1 + d2;

        System.out.println(dSum);

        //declaring boolean variables
        boolean good = true;
        boolean bad = false;

        System.out.println("Good: " + good);
        System.out.println("Bad: " + bad);

        boolean notGood = !good;
        System.out.println("Not good is: " +            notGood);

        // Strings

        //declaration/initialisation
        String str = "Hello there";
        System.out.println(str);

        String name = "Peter Pan";

        //concatenation

        String greeting = str + " " + name;
        System.out.println(greeting);
    }
}
