package arraysstrings;

public class DuplicateCharacters {

    public static void main(String[] args){
        String str = "america";
        int[] counts = new int[str.length()];
        for(int i = 0; i < str.length()-1; i++){
            for(int j = 1; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    counts[str.charAt(i)]++;
                }
            }
        }

        for(int i = 0; i< counts.length; i++){
            if(counts[i]>1){
                System.out.println((char)i + ": " + counts[i]);
            }
        }
    }
    
}
