package c1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VariableDeclaration01Test extends StaticTestVariables {

    // Do not alter the 'assertThat' statements, these are what we are working towards.

    @Test
    public void declareSomeIntVariables() {
        //declare an int called 'a', initialise its value to 10

        assertThat(a, is(10));
    }

    @Test
    public void declareSomeMoreIntVariables() {
        //declare an int called 'a', initialise its value to -5
        //declare an int called 'b', initialise its value to 33


        assertThat(a, is(-5));
        assertThat(b, is(33));
    }

    @Test
    public void sumTwoInts() {
        int x = 10;
        int y = 20;

        //declare an int called 'sum' which is the sum of x and y


        assertThat(sum, is(30));
    }
    @Test
    public void declareSomeDoubleVariables() {
        //declare a double called 'd1', initialise its value to 123.25

        assertThat(d1, is(123.25));
    }

    @Test
    public void declareSomeMoreDoubleVariables() {
        //declare an double called 'd1', initialise its value to 1.0
        //declare an double called 'd2', initialise its value to -5.4


        assertThat(d1, is(1.0));
        assertThat(d2, is(-5.4));
    }

    @Test
    public void sumTwoDoubles() {
        double x = 10.5;
        double y = 19.5;

        //declare an double called 'dsum' which is the sum of x and y


        assertThat(dsum, is(30.0));
    }

    @Test
    public void declareString() {
        //declare a string variable called 'str' so that the assert statement below passes.


        assertThat(str, is("hello Java"));

    }

    @Test
    public void concatenateStrings() {
        String str1 = "bit";
        String str2 = "trickier";

        //declare a string called 'concat' that makes the following assert pass.


        assertThat(concat, is("bit trickier"));
    }


}