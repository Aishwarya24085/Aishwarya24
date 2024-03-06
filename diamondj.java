class ClassA1
{
    public
    void aClass()
    {
        System.out.println("Iam a ClassA");
    }
}
class ClassB1 extends ClassA1
{
    public
    void bClass()
    {
        System.out.println("Iam a ClassB");
    }
}
class ClassC1 extends ClassA1
{
    public
    void cClass()
    {
        System.out.println("Iam a ClassC");
    }
}
/*
class ClassD extends ClassA1,ClassB1
{
}
*/
//Here the actual problem occurs where the support of Multiple Inheritance in java is
//eliminated.
public class diamondj
{
    public static void main(String[] args)
    {
    System.out.println("Diamond Problem");
    ClassB1 class1=new ClassB1();
    ClassC1 class2=new ClassC1();
    class1.aClass();
    class1.bClass();
    class2.aClass();
    class2.cClass();
    /*We can access upto half part of the diamond problem. The other half includes the
    multiple Inheritance.
    Java does not support multiple inheritances to avoid the diamond problem which causes
    complexity and ambiguity.
    Well we can achieve multiple inheritance by the concept of interface.*/
    }
}
