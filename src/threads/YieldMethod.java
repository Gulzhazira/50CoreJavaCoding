package threads;

public class YieldMethod extends Thread{

    public void run(){
        System.out.println("I can wait if you wanna run");
        Thread.yield();
        System.out.println("was I in pause");
    }
    
    public static void main(String[] args) {
        YieldMethod thread = new YieldMethod();
        thread.start();

    }
}
