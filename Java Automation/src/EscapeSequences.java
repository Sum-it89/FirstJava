public class EscapeSequences
{
    public static void main(String[] args)
    {
        String name = "Sumit";
        String surname = "Risal\n";

        System.out.println(name);
        System.out.println(name.replaceAll("Sumit", "Risal"));
        //System.out.println(name.replaceAll());


    }
}
