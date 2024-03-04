class ClassA1
{
    public
    void aClass()
    {
        System.out.print("Iam a ClassA"+"\n");
    }
}
class ClassB1 extends ClassA1
{
    public
    void bClass()
    {
        System.out.print("Iam a ClassB"+"\n");
    }
}
class ClassC1 extends ClassA1
{
    public
    void cClass()
    {
        System.out.print("Iam a ClassC"+"\n");
    }
}
class ClassD extends ClassA,ClassB
{
}
//Here the actual problem occurs where the support of Multiple Inheritance in java is
//eliminated.
public class diamondj
{
    public static void main(String[] args)
    {
    System.out.print("Diamond Problem"+"\n");
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