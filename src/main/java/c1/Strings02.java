package c1;

public class Strings02 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        String concat = s1 + " " + s2 + "!!!";

        System.out.println(concat);

        //Useful methods on String object:

        //Length
        int s1Length = s1.length();
        System.out.println("length of s1 is " + s1Length);

        //substring
        String sub = s1.substring(1, 5);
        System.out.println("Substring: " + sub);

        String anotherSubstring = s1.substring(3);
        System.out.println("Another substring: " + anotherSubstring);


        //find position of character
        String url = "www.site.com?name=Simon&id=999";
        int positionOfQuestionMark = url.indexOf('?');
        System.out.println(url.substring(positionOfQuestionMark + 1));

        //isEmpty
        boolean s1Empty = s1.isEmpty();
        System.out.println("Is s1 empty? " + s1Empty);

        boolean blankIsEmpty = "".isEmpty();
        System.out.println("Is blank string empty? " + blankIsEmpty);

        //Lowercase
        String lowerHello = s1.toLowerCase();
        System.out.println(lowerHello);

        //Uppercase
        String upperWorld = s2.toUpperCase();
        System.out.println(upperWorld);

        //Equality
        String person1 = "Mickey";
        String person2 = "Donald";
        String person3 = "Mickey";

        boolean oneEqualsTwo = person1.equals(person2);
        boolean oneEqualsThree = person1.equals(person3);

        System.out.println("person1 = person2? " + oneEqualsTwo);
        System.out.println("person1 = person3? " + oneEqualsThree);

    }
}
