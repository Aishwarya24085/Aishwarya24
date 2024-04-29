public class ThreadCreation_class extends Thread {
    private String name;

    ThreadCreation_class(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        ThreadCreation_class t1 = new ThreadCreation_class("Aishwarya");
        ThreadCreation_class t2 = new ThreadCreation_class("Aishu");
        t1.start();
        t2.start();
    }
}

