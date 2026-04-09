// 8. Get Character at Given Index

// public class BasiceString4 {
//     public static void main(String[] args) {
//         String s ="Hello";

//         char ch = s.charAt(1);

//         System.out.println(ch);
//     }
// }

// 9. Replace Characters in a String

// public class BasiceString4 {
//     public static void main(String[] args) {
//         String name = "apple";

//         System.out.println(name.replace('p', 'b'));
//     }
// }

//  10 Split a String by Space

public class BasiceString4 {
    public static void main(String[] args) {
        String name = "java is fun";

        String [] words = name.split(" ");

        for(String word :words){
         System.out.println(word);
        }
    }
}

