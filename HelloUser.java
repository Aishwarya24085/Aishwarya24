import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name =ip.nextLine();
        System.out.println("Hello "+name+"!");
        ip.close();
    }
}
