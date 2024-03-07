import java.util.Scanner;

class AccessSpecifierDemo{
    int pubvar;
    protected int provar;
    private int privar;

    void setVar(int priValue,int proValue, int pubValue)
    {
        pubvar=pubValue;
        provar=proValue;
        privar=priValue;
    }
    void getVar()
    {
        System.out.println("Private Variable:"+privar);
        System.out.println("Protected Variable:"+provar);
        System.out.println("Public Variable:"+pubvar);
    }
}

public class AbsEncap{
    public static void main(String[] args) {
        int p1,p2,p3;
        Scanner ip = new Scanner(System.in);
        AccessSpecifierDemo obj = new AccessSpecifierDemo();
        System.out.println("Enter private variable:");
        p1=ip.nextInt();
        System.out.println("Enter protected variable:");
        p2=ip.nextInt();
        System.out.println("Enter public variable:");
        p3=ip.nextInt();
        obj.setVar(p1, p2, p3);
        obj.getVar();
        ip.close();
    }
}
   