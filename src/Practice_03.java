public class Practice_03 {
    public static void main(String[] args) {
        // Problem 1- Converting string to lowercase
       /*
        String Name="My Name Is Shashwat Rai";
        String name= Name.toLowerCase();
        System.out.println(name);

        */

        // Problem 2- Replacing Space with Underscore
        /*
        String name="My name is Shashwat Rai";
        System.out.println(name.replace(' ', '_'));

         */

        // Problem 3- Filling a letter template
        /*
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Sachin");
        System.out.println(letter);
        */


        // Problem 4- Detecting double and tripple spaces in string
        /*
        String myString = "This string contains double and  triple   spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

         */

        // Problem 5- Escape sequence
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);
    }
}
