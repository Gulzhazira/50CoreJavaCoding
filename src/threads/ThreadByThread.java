package threads;

public class ThreadByThread extends Thread{

    @Override
    public void run(){
        System.out.println("I am a developer");
    }

    public static void main(String[] args) {
        ThreadByThread mythread = new ThreadByThread();
        mythread.run();
    }
    
}
