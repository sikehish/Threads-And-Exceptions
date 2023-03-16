class MyThread extends Thread{
    public void run(){
        try{
            for(int i=0; i<5; i++){
                System.out.println(i);
                System.out.println("MYTHREAD: " + Thread.currentThread().getState().toString());
                System.out.println("Namee " + this.getName().toString());
                if(i==1) sleep(3000);
        }
        }catch(InterruptedException err){
            System.out.println("ERRRORR");
        }finally{
            System.out.println("Thread killed!!!!!!!!!!!!!!!!");
            System.out.println("Run method isalive "+ isAlive()); // True
        }
    }

}

public class ThreadsPractice {
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        System.out.println("before starting thread isAlive: "+t1.isAlive());  
        t1.start();
        System.out.println("after starting thread isAlive: "+t1.isAlive());  
        System.out.println("Main " + Thread.currentThread().getState().toString());
        System.out.println("Main thread done");
        System.out.println("After main thread isAlive: "+t1.isAlive());  

    }
}
