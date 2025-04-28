package exception;

public class tryCatchFinally {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int a = 4;
        int b = 0;
        try{
            System.out.println(arr[6]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } finally{
            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } finally{
                System.out.println("finally block in the finally block");
            }
        }        
    }

    
}
