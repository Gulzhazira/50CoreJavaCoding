package javabasics;

public class Gcd {
    public int gcd(int a, int b){
        int n = a*b;
        for(int i = a; i <= a*b; i += a){
            if(i%b == 0){
                n = i;
                break;
            }
        }
        return n;
    }

    public static void main(String[] args){
        Gcd obj = new Gcd();
        System.out.println(obj.gcd(4,6));
    } 
    
}
