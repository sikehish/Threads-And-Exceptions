class MyThread1 extends Thread{
    String msg;
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("JSS STU");
        }
        System.out.println("Exit from JSS STU");
    }
}

class MyThread2 extends Thread{

    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("JSS MVP");
        }
        System.out.println("Exit from JSS MVP");
    }
}

class MyThread3 extends Thread{

    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("JSSMC");
        }
        System.out.println("Exit from JSSMC");
    }
}


public class PYQExample2 {
    public static void main(String[] args) {
        MyThread1 t1= new MyThread1();
        MyThread2 t2= new MyThread2();
        // MyThread3 t3= new MyThread3();
        t1.start();
        t2.start();
        // t3.start();
    }
}

