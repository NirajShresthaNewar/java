class Tle{
    synchronized void printTle(int n){
        for(int i=1;i<=5;i++){
        System.out.println(n*i);
    }
        try{
            Thread.sleep(400);
        }catch(Exception e) {
            System.out.println(e);
        }
        }
    }

class MyThread1 extends Thread{
    Tle t;
    MyThread1(Tle t){
        this.t=t;
    }
    public void run(){
        t.printTle(5);
    }
}
class MyThread2 extends Thread{
    Tle t;
    MyThread2(Tle t){
        this.t=t;
    }
    public void run(){
        t.printTle(100);
    }
}
 public class Synchronized{
    public static void main(String[]args){
        Tle obj= new Tle();
        MyThread1 t1= new MyThread1(obj);
        MyThread2 t2= new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
