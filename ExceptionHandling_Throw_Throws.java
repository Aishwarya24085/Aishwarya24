class OutOfStock extends Exception
{
    public OutOfStock(String message)
    {
        System.out.println(message);
    }
}
class Grocery
{
    private String name;
    private int stock;
    public Grocery(String name, int stock)
    {
        this.name=name;
        this.stock=stock;
    }
    public void purchase(int quantity) throws OutOfStock
    {
        if(quantity>stock)
        {
            throw new OutOfStock("Sorry, "+name+" is out of stock.");
        }
        else
        {
            stock-=quantity;
            System.out.println(quantity+" "+name+"(s) purchased.");
        }
    }
}
public class ExceptionHandling_Throw_Throws
{
    public static void main(String[] args)
    {
        Grocery obj1=new Grocery("Mango",30);
        Grocery obj2=new Grocery("Guva",10);
        try
        {
            obj1.purchase(15);
        } 
        catch (OutOfStock e){}
        try
        {
            obj2.purchase(12);
        } 
        catch (OutOfStock e){}
    }
}