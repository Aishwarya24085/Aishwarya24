class ClassA
{
    public
    void aClass()
    {
        System.out.println("Iam a ClassA");
    }
}
class ClassB extends ClassA
{
    public
    void bClass()
    {
        System.out.println("Iam a ClassB");
    }
}
class ClassC extends ClassA
{
    public
    void cClass()
    {
        System.out.println("Iam a ClassC");
        }
}
class ClassD extends ClassB
{
    public
    void dClass()
    {
        System.out.print("Iam a ClassD"+"\n");
    }
}
/*class ClassE extends ClassA,ClassB
{
}*/
/*Java doesn't support Multiple Inheritance and Hybrid Inheritance.*/

public class Types_Inheritance{
    public static void main(String[] args){
    //Simple Inheritance
    System.out.println("Simple Inheritance"+"\n");
    ClassB class1=new ClassB();
    class1.aClass();
    class1.bClass();
    //Hierarchical Inheritance
    System.out.println("Hierarchical Inheritance");
    ClassC class2=new ClassC();
    class1.aClass();
    class1.bClass();
    class2.aClass();
    class2.cClass();
    //Multi-Level Inheritance
    System.out.println("Multi-Level Inheritance");
    ClassD class3=new ClassD();
    class3.aClass();
    class3.bClass();
    class3.dClass();
    /*Java does not support multiple inheritances to avoid the diamond problem
    which causes complexity and ambiguity. Well we can achieve multiple inheritance by the
    concept of interface.*/
    }
}
