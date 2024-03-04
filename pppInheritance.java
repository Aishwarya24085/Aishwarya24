class Public{
    public
        int pubv=10;
    protected
        int prov=20;
    private
        int priv=30;
    public int getpriv()
    {
        return priv;
    }
}
/*private class Private
{
}*/
//We can't take a top-level class as private because it would be completely useless as nothing
//would have access to it.

/*protected class Protected
{
}*/
//We can't take a top-level class as protected because it would be completely useless.

public class pppInheritance {
    public static void main(String[] args)
    {
        Public pub=new Public();
        System.out.println("Public variable: "+pub.pubv);
        //System.out.println("Private variable: "+pub.priv);
        //We cannot access the privateVar because it is private i.e, accessible only within the class.
        //so we have used a method getpriv() to access it indirectly.
        System.out.println("Private variable: "+pub.getpriv());
        System.out.println("Protected variable: "+pub.prov);
    }

}
