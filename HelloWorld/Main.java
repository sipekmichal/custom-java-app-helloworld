package HelloWorld;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        System.out.println("Press \"ENTER\" to exit this program...");
        try {
            int read = System.in.read(new byte[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }