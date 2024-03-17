class Addition{
    public void add(int a, int b){
        System.out.println("Addition of two int numbers:"+(a+b));
    }
    public void add(int a, int b, int c){
        System.out.println("Addition of three int numbers:"+(a+b+c));
    }
    public void add(double a, double b, double c){
        System.out.println("Addition of three float numbers:"+(a+b+c));
    }
    public void add(double a, double b){
        System.out.println("Addition of two float numbers:"+(a+b));
    }
}

public class methodoverload{
    public static void main(String[] args){
        Addition addition = new Addition();
        addition.add(1,2);
        addition.add(1,2,3);
        addition.add(1.7,2.8);
        addition.add(1.7,2.8,3.9);
    }
}