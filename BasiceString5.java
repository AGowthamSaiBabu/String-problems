// 11. Reverse a String

// public class BasiceString5 {
//     public static void main(String[] args) {
//         String str = "Java";
//         String reved = "";

//         for (int i = str.length() - 1; i >= 0; i--) {
//             reved = reved + str.charAt(i);
//         }

//         System.out.println("Reved String:" + reved);
//     }
// }

// 12. Check if String Starts With a Word

// public class BasiceString5 {
//     public static void main(String[] args) {
//         String str ="Hello java";
//         String words ="Hello";

//         boolean result =str.startsWith(words);

//         System.out.println(result);
//     }
// }

// Method 2: Using Loop (Very Basic Logic)


public class BasiceString5 {
    public static void main(String[] args) {
        String str ="Hello java";
        String word ="Hello";

        boolean result =true;

        for(int i=0;i<word.length();i++){
            if(str.charAt(i) != word.charAt(i)){
                result =false;
                break;
            }
        }
        System.out.println(result);
    }
}