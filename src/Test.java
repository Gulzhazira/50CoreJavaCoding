public class Test {

    public static void main(String[] args) {
        String str = "I am \n Jazira \t";
        String str2 = "";
        for(int i = 0; i < str.length(); i++){
            boolean whiteSpace = Character.isWhitespace(str.charAt(i));
            if(!whiteSpace){
                str2 += str.charAt(i);
                //str = str.substring(0, i) + str.substring(i+1);
            }
        }
        System.out.println(str);
        System.out.println(str2);
    }
    
}
