import java.util.Scanner;
class StudentCon
{
    String collegeName;
    int collegeCode;
    String fullName;
    double semPercentage;

    
    StudentCon()
    {
        String collegeName = "MVGR";
        int collegeCode = 33;
        System.out.println("College Code : " + collegeName);
        System.out.println("College Code : " + collegeCode);
    }
    StudentCon(String fullName, double semPercentage)
    {
        System.out.println("Full Name : " + fullName);
        System.out.println("Sem Percentage : " + semPercentage);
    }

    public void finalize()
    {
        System.out.println("I am Dead!!");
    }
}



public class ParamConst{
    public static void main(String[] args)
        {
            Scanner ip = new Scanner(System.in);
            String fn;
            double sp;
            System.out.println("Enter your Name:");
            fn=ip.nextLine();
            System.out.println("Enter your Sem Percentage:");
            sp=ip.nextDouble();
            StudentCon s = new StudentCon();
            StudentCon s1 = new StudentCon(fn,sp);
            s.finalize();
            s1.finalize();
        }
}
