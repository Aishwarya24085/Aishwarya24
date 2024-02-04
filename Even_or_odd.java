import java.util.Scanner;

public class Even_or_odd {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = input.nextInt();
        if(num%2==0)
        {
            System.out.println(num+" is a Even Number.");
        }
        else if(num%2==1 || num%2==-1)
        {
            System.out.println(num+" is a Odd Number.");
        }
        else
        {
            System.out.println("neither Even nor odd.");
        }
        input.close();
    }
}
