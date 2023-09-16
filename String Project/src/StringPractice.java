import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringPractice
{

    //String Variables....................
    String String1 = "PHP Exercises and";
    String String2 = "Python Exercises";

    String S3 = "PHP Exercises and Python Exercises";

    String Old = "£30.00 are not equal to £20.00";

    String Exercises = "Python Exercises";
    String Exercise = "Python Exercise";

    static String Stephen = "Stephen Edwin King";
    static String Walter = "Walter Winchell";
    static String edwin = "stephen edwin king";

    static String OLD = "Rajesh34 patel45 2345988 London";

    static String Length = "example.com";

    static String Red = "Red is favorite color. starts with Red?";
    static  String Orange = "Orange is also my favorite color. starts with Red?";

    static String dog = "The quick brown fox jumps over the lazy dog";
    static String fox = "brown fox jumps";

    static String Replace = "Rajesh Moradia";


    // Object for non static methods.......
    static StringPractice stringPractice = new StringPractice();



    public static void main (String[] args)
    {

        stringPractice.ConString();
        stringPractice.Charvalue();
        stringPractice.Symbol();
        stringPractice.Exercises();

        Compare();
        Number();
        length();
        Color();
        Substring();
        replace();


    }

    //  Non Static Methods...............................................
     public void ConString()
    {
        System.out.println("String 1: "+String1);
        System.out.println("String 2: "+String2);
       System.out.println("The Concatenated string: "+String1+" "+String2);
    }

    public void Charvalue()
    {
        System.out.println("Original String: PHP Exercises and Python Exercises");
        System.out.println("Specified sequence of char values: and \n"+S3.contains("and"));
    }

    public void Symbol()
    {
        System.out.println("Old: "+Old);
        System.out.println("New: "+Old.replaceAll("£", " "));
    }

    public void Exercises ()
    {
        System.out.println("\""+"Python Exercises"+"\""+" ends with "+ "\""+"se"+"\"" +"? "+ Exercises.endsWith("se"));
        System.out.println("\""+"Python Exercise"+"\""+" ends with "+ "\""+"se" +"\""+"? "+Exercise.endsWith("se"));
    }

    static void Compare ()
    {
        boolean equals1 = Stephen.equalsIgnoreCase(Walter);
        boolean equals2 = Stephen.equalsIgnoreCase(edwin);
        System.out.println("\""+Stephen+"\"" + " equals "+"\""+ Walter +"\""+ "?"+" "+equals1);
        System.out.println("\""+Stephen+"\"" + " equals "+"\""+ edwin +"\""+ "?"+" "+equals2);
    }


    //  Static Methods..................................................
    static void Number ()
    {
        System.out.println("Old :"+OLD);
        System.out.println("New :"+OLD.replaceAll("[^0-9]",""));

    }

    static void length()
    {
        System.out.println("The string length of 'example.com' is: "+Length.length());
    }

    static void Color()
    {
        System.out.println("Red is favorite color. starts with Red? "+Red.startsWith("Red"));
        System.out.println("Orange is also my favorite color. starts with Red? "+Orange.startsWith("Red"));
    }

    static void Substring()
    {
        System.out.println("Old = "+dog);
        System.out.println("new = " + dog.substring(10, 26));
    }

    static void replace()
    {
        System.out.println("Old:"+Replace);
        System.out.println("New:"+Replace.replaceAll("a", "T"));

    }






}
