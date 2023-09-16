public class Calculator2
{

    static float answer;
    static float a=10;
    static float b=20;

    public static void main(String[] args)
    {
        add();
        subtract();
        multiply();
        division();

    }
    public static void add()
    {
        answer = a+b;
        System.out.println("Addition of "+a+" & "+b+" = "+answer);
    }

    public static void subtract()
    {
        answer = a-b;
        System.out.println("Subtraction of "+a+" & "+b+" = "+answer);
    }

    public static void multiply()
    {
        answer = a*b;
        System.out.println("Multiplication of "+a+" & "+b+" = "+answer);
    }

    public static void division()
    {
        answer = a/b;
        System.out.println("Division of "+a+" by "+b+" = "+ answer);
    }
    
}
