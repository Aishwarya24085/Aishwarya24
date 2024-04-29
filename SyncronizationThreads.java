class Table{
    void print(int num){
        synchronized(this){
            for(int i=1;i<=10;i++){
                System.out.println(num+" * "+i+" = "+(num*i));
                try{
                Thread.sleep(40);
                }catch(Exception e){
                System.out.println(e);
                }
            }
            System.out.println();
        }
    }
}
class Thread1 extends Thread{
    int num;
    Table t=new Table();
    Thread1(Table t,int num){
        this.t=t;
        this.num=num;
    }
    public void run(){
        t.print(num);
    }
}
class Thread2 extends Thread{
    int num;
    Table t=new Table();
    Thread2(Table t,int num){
        this.t=t;
        this.num=num;
    }
    public void run(){
        t.print(num);
    }
}
public class SyncronizationThreads{
    public static void main(String[] args) {
        Table obj=new Table();
        Thread1 obj1=new Thread1(obj,11);
        Thread2 obj2=new Thread2(obj, 19);
        obj1.start();
        obj2.start();
    }
}
