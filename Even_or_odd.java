import java.util.Scanner;

public class Even_or_odd {
    static void Check(int num){
        if(num%2==0){
            System.out.println(num+" is Even.");
        }
        else{
            System.out.println(num+" is Odd.");
        }
    }
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = ip.nextInt();
        Check(num);
        ip.close();
    }
}