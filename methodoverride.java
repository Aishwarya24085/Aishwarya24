class mainclass{
    public void displaymsg()
    {
        System.out.println("I am a main class");
    }
}
class subclass extends mainclass{
    @Override
    public void displaymsg()
    {
        System.out.println("I am a subclass");
    }
}
public class methodoverride{
    public static void main(String[] args){
        subclass obj = new subclass();
        obj.displaymsg();
    }
}