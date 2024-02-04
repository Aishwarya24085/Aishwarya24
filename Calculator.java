import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double number1,number2;
        System.out.println("Enter Number1:");
        number1=input.nextDouble();
        System.out.println("Enter Number2:");
        number2=input.nextDouble();
        System.out.printf("Available operations:%n1-Addition%n2-Subtraction%n3-Multiplication%n4-Division%n%n");
        System.out.printf("Choose an operation:");
        int choice=input.nextInt();
        if(choice==1)
        {
            System.out.printf("Additon of "+number1+" "+number2+"%n");
            System.out.println(number1+" + "+number2+" = "+(number1+number2));
        }
        else if(choice==2)
        {
            System.out.printf("Subtraction of "+number1+" "+number2+"%n");
            System.out.println(number1+" - "+number2+" = "+(number1-number2));
        }
        else if(choice==3)
        {
            System.out.printf("Multiplication of "+number1+" "+number2+"%n");
            System.out.println(number1+" * "+number2+" = "+(number1*number2));
        }
        else if(choice==4)
        {
            System.out.printf("Division of "+number1+" "+number2+"%n");
            System.out.println(number1+" / "+number2+" = "+(number1/number2));
        }
        else
        {
            System.out.println("Can't Perform that operation");
        }
        input.close();
    }
}
