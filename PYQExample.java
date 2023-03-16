class MyThread extends Thread{
    String msg;
    MyThread(String msg){
        super();
        this.msg=msg;
    }
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(msg);
        }
    }
}


public class PYQExample {
    public static void main(String[] args) {
        MyThread t1= new MyThread("JSS STU");
        MyThread t2= new MyThread("JSS MVP");
        t1.start();
        t2.start();
    }
}
