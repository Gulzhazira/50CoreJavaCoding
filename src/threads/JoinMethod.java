package threads;

public class JoinMethod extends Thread{

    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        JoinMethod join = new JoinMethod();
        PrintOddNumbers odd = new PrintOddNumbers();
        PrintEvenNumbers even = new PrintEvenNumbers();
        join.start();
        odd.start();
        even.start();

        try {
            even.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
