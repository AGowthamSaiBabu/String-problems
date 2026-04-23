// 25. Remove a Specific Character

// public class BasiceString8 {
//     public static void main(String[] args) {
//         String str ="apple";
//         char ch ='p';

//         String result ="";

//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i) !=ch){
//                 result +=str.charAt(i);
//             }
//         }
//         System.out.println(result);
//     }
// }

// 26. Check if a String is Made of Only Alphabets

public class BasiceString8 {
    public static void main(String[] args) {
        String str ="Java123";

        boolean result =true;

        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);

            if(!Character.isLetter(ch)){
                result =false;
                break;
            }
        }
        System.out.println(result);
    }
}