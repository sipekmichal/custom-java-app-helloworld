package HelloWorld;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your nationality: ");
        String nationality = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
    }
}