package threads;

public class PrintEvenNumbers extends Thread{

    public void run(){
        for(int i = 0; i < 10; i++){
            if(i%2 == 0){
                System.out.println("It was an even number: " + i);
            }
        }
    }
    
}
