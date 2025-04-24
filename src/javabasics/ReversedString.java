package javabasics;

public class ReversedString {

    public String revString(String str){
        String reversedStr = "";

        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return null;
        }
        for (int i = str.length()-1; i >= 0; i--){
            reversedStr += str.charAt(i);
        }

        return reversedStr;
    }

    public static void main(String[] args) {
        ReversedString obj = new ReversedString();
        System.out.println(obj.revString("jazira"));
    }
    
}
