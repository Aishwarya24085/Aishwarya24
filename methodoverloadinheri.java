class Student
{
    String FullName;
    int RollNumber;
    double Cgpa;
    String Department;
    void getdata(String name,int roll,double cgpa,String dep)
    {
        FullName=name;
        RollNumber=roll;
        Cgpa=cgpa;
        Department=dep;
    }
}
class Student1 extends Student{
    String Section;
    void getdata(String name,int roll,double cgpa,String dep,String sec)
    {
        FullName=name;
        RollNumber=roll;
        Cgpa=cgpa;
        Department=dep;
        Section=sec;
    }
    void display()
    {
        System.out.println("Student Details\n");
        System.out.println("Name: "+FullName);
        System.out.println("Roll Number: "+RollNumber);
        System.out.println("Cgpa: "+Cgpa);
        System.out.println("Department: "+Department);
        System.out.println("Section: "+Section);
    }
}
public class methodoverloadinheri{
    public static void main(String[] args){
        Student1 s1 = new Student1();
        s1.getdata("Aishwarya",14,9.0,"CSE");
        s1.display();
        Student1 s2 = new Student1();
        s2.getdata("Aishwarya",14,9.0,"CSE","A");
        s2.display();
    }
}