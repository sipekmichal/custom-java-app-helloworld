package HelloWorld;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        try {
            // waiting for enter to exit this program
            int read = System.in.read(new byte[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}