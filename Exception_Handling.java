import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception_Handling{
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("nonexistentfile.txt");
            fileInputStream.close();
        } catch (FileNotFoundException obj) {
            System.out.println("File not found!!");
        } catch (IOException obj) {
            System.out.println("An I/O error occurred!!");
        }
        try {
            // Attempt to load a class dynamically
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException obj) {
            // Handle the ClassNotFoundException1
            System.out.println("Class not found!!");
        }
        try {
            int[] numbers = {1, 2, 3};
            int indexOutOfRange = numbers[3];
            System.out.println("Element at index 3: " + indexOutOfRange);
        } catch (ArrayIndexOutOfBoundsException obj) {
            // Handle the ArrayIndexOutOfBoundsException
            System.out.println("Array index out of bounds!!");
            // Optionally, perform additional error handling or recovery actions
        }
        try {
            String str = null;
            int length = str.length();
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException obj) {
            // Handle the NullPointerException
            System.out.println("NullPointerException caught!!");
        }
        try {
            int dividend = 10;
            int divisor = 0;
            int result = dividend / divisor;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException obj) {
            // Handle the ArithmeticException
            System.out.println("ArithmeticException caught!!");
        }

    }
}