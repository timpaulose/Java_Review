package Datatypes;

public class String_Concepts {
    public static void main(String[] args) {

        String testString = "How long is this sentence?";

        //.length()
        System.out.println(testString.length());

        //.toLowerCase()
        System.out.println(testString.toLowerCase());

        //.toUpperCase()
        System.out.println(testString.toUpperCase());

        String testString2 = "How true is this sentence?";

        //.equals()
        System.out.println(testString.equals(testString2));

        String testString3 = "How Long IS this SeNTEnce?";

        //.equalsIgnoreCase()
        System.out.println(testString.equalsIgnoreCase(testString2));
        System.out.println(testString.equalsIgnoreCase(testString3));

        //.contains()
        boolean containsTest = testString.contains("How");
        System.out.println(containsTest);

        //.replace()
        String replaceTest = testString.replace("i", "a");
        System.out.println(replaceTest);

        //.charAt()
        System.out.println(testString);
        System.out.println(testString.length());
        System.out.println(testString.charAt(14));

        //.indexOf()
        System.out.println(testString.indexOf("i"));

        //.lastIndexOf()
        System.out.println(testString.lastIndexOf('i'));

        //.startsWith()
        System.out.println(testString.startsWith("How"));
        System.out.println(testString.startsWith("how"));

        //.endsWith()
        System.out.println(testString.endsWith("?"));
        System.out.println(testString.endsWith("sentence?"));
        System.out.println(testString.endsWith("sentence"));

        //.trim()

        //.subString()

        //.split()






    }
}
