
package javabasics;

public class PrimeNumber {
    public boolean isNumPrime(int n){
        for(int i = 2; i<n; i++){
            if(n%i == 0){
                return false;   //returns false if n is not a prime number
            }
        }
        return true;   //returns true if n is a prime number
    }

    public static void main(String[] args) {
        PrimeNumber num = new PrimeNumber();
        System.out.println(num.isNumPrime(5));
    }
}
