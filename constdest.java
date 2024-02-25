import java.util.Scanner;


class Student
{
    String fullName;
    int rollNum;
    double semPercentage;
    String collegeName;
    int collegeCode;
    Scanner ip = new Scanner(System.in);

    Student()
    {
        System.out.println("Constructor is Created!!\nObject of Student class is created\n");
        System.out.println("Enter your Full Name:");
        fullName=ip.nextLine();
        System.out.println("Enter your RollNo:");
        rollNum=ip.nextInt();
        System.out.println("Enter your Sem Percentage:");
        semPercentage=ip.nextDouble();
        ip.nextLine();
        System.out.println("Enter your College Name:");
        collegeName=ip.nextLine();
        System.out.println("Enter your College Code:");
        collegeCode=ip.nextInt();
    }

    void GetInfo()
    {
        System.out.println("\nStudent Info---\n\n");
        System.out.println("Student Name : " + fullName);
        System.out.println("Student Roll Number : " + rollNum);
        System.out.println("Student sem Percentage : " + semPercentage);
        System.out.println("Student college name : " + collegeName);
        System.out.println("Student college code : " + collegeCode);
    }

    public void finalize()
    {
        System.out.println("I am Dead!!");
    }
}

public class constdest{
    public static void main(String[] args)
        {
            Student s = new Student();
            s.GetInfo();
            s.finalize();
        }
}