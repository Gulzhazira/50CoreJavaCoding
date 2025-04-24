package arraysstrings;

public class DuplicateCharacters {

    public static void main(String[] args){
        String str = "jazirajazi";
        int[] n = new int[256];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            n[ch]++;
        }

        for(int i = 0; i< n.length; i++){
            if(n[i]>1){
                System.out.println((char)i + ": " + n[i]);
            }
        }
    }
    
}
