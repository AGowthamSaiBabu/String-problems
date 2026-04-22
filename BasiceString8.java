// 25. Remove a Specific Character

public class BasiceString8 {
    public static void main(String[] args) {
        String str ="apple";
        char ch ='p';

        String result ="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) !=ch){
                result +=str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
