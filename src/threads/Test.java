package threads;

    public class Test extends Thread {
        public void run() {
            try {
                System.out.println("Task started...");
                Thread.sleep(2000); // Sleep for 2 seconds
                System.out.println("Task resumed after sleep!");
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }

        public static void main(String[] args) {
            Test test = new Test();
            test.start();
        }
    }
    

