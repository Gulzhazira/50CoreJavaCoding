package arraysstrings;


public class RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        String str = "My name is Jazira";
        String str2 = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                str2 += str.charAt(i);
            }
        }

        System.out.println(str2);
    }
}
