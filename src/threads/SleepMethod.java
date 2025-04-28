package threads;

public class SleepMethod extends Thread{

    public void run(){
        try {
            System.out.println("I am gonna sleep for 1500 millisec");
            Thread.sleep(1500);
            System.out.println("I wake up");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        SleepMethod thread = new SleepMethod();
        thread.start();
    }
    
}
