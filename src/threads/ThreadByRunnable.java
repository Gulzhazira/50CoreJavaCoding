package threads;

public class ThreadByRunnable implements Runnable{

    @Override
    public void run(){
        System.out.println("a thread from Runnable");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadByRunnable());
        thread.start();
    }
    
}
