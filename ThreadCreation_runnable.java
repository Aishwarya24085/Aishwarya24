public class ThreadCreation_runnable implements Runnable{
    private String name;
    ThreadCreation_runnable(String name)
    {
        this.name=name;
    }
    public void run(){
        System.out.println("Hello "+name);
    }
    public static void main(String[] args) {
        ThreadCreation_runnable t1 = new ThreadCreation_runnable("Aishwarya");
        ThreadCreation_runnable t2 = new ThreadCreation_runnable("Aishu");
        t1.run();
        t2.run();
    }
}
