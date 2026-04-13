// 13. Check if String Ends With a Word

// public class BasiceString6 {
//     public static void main(String[] args) {
//         String str ="Hello Java";
//         String word ="Java";

//         boolean result = str.endsWith(word);

//         System.out.println(result);
//     }
// }

// 14. Count Occurrence of a Character

// public class BasiceString6 {
//     public static void main(String[] args) {
//         String str ="banana";
//         char ch ='a';
//         int count =0;

//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)==ch){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// 15. Remove All Whitespaces from a String
public class BasiceString6 {
    public static void main(String[] args) {
    String str ="Java is cool";
    String result = str.replaceAll("\\s","");
    System.out.println(result);
    }
}
