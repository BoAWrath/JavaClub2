package c1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Strings02Test extends StaticTestVariables {

    @Test
    public void init_StringOfLength() {
        //initialise string s below(to anything of your choosing) so that assert statement goes green
        String s = null;

        assertThat(s.length(), is(10));
    }

    @Test
    public void substringTest() {
        String s = "hello java world";

        //alter the index ints below so that the assert statement goes green
        int startIndex = 0;
        int endIndex = 0;
        String sub = s.substring(startIndex, endIndex);


        assertThat(sub, is("java"));
    }

    @Test
    public void anotherSubstringTest() {
        String s = "forget money";

        //alter the index subIndex below so that the assert statement goes green
        int subIndex = 0;

        String sub = s.substring(subIndex);


        assertThat(sub, is("get money"));
    }

    @Test
    public void lowercase() {
        String s = "THIS IS BIG";

        //declare a variable called 'lower' that makes assertion pass

        assertThat(lower, is("this is big"));
    }

    @Test
    public void uppercase() {
        String s = "this is small";

        //declare a variable called 'upper' that makes assertion pass

        assertThat(upper, is("THIS IS SMALL"));
    }

    @Test
    public void equals() {
        String str1 = "easy";
// declare a String str2 so that assertion passes

        assertThat(str1.equals(str2), is(true));
    }

    @Test
    public void notEquals() {
        String str1 = "easy";
// declare a String str2 so that assertion passes

        assertThat(str1.equals(str2), is(false));
    }
}