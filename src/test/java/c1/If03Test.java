package c1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class If03Test extends StaticTestVariables {

    @Test
    public void basicIfStatement() {
        int b = 1;
        // declare and assign a value to int 'a' so that assertion passes

        //uncomment line below
        //int a = ?

        if (a == 100) {
            b = 999;
        }

        assertThat(b, is(999));
    }

    @Test
    public void anotherBasicIfStatement() {
        int b = 1;
        int a = 50;

        //alter if statement condition below to be an expression involving variable 'a'
        //so that assertion passes.
        if (false) {
            b = 999;
        }

        assertThat(b, is(999));
    }

    @Test
    public void elsePart() {
        int a = 50;
        int b = -1;

        // if statement below assigns 33 to 'b' when 'a' is zero
        // add an 'else' clause that assigns 66 to 'b' when 'a' is not zero

        if (a == 0) {
            b = 33;
        }

        assertThat(b, is(66));
    }
}