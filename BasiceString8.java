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

// public class BasiceString8 {
//     public static void main(String[] args) {
//         String str ="Java123";

//         boolean result =true;

//         for(int i=0;i<str.length();i++){
//             char ch =str.charAt(i);

//             if(!Character.isLetter(ch)){
//                 result =false;
//                 break;
//             }
//         }
//         System.out.println(result);
//     }
// }

// 27. Count Capital and Small Letters Separately

// public class BasiceString8 {
//     public static void main(String[] args) {
//         String str ="JaVA123";
//         int upper =0;
//         int lower =0;

//         for(int i=0;i<str.length();i++){
//             char ch =str.charAt(i);

//             if(Character.isUpperCase(ch)){
//                 upper++;
//             }else if(Character.isLowerCase(ch)){
//                 lower++;
//             }
//         }
//         System.out.println("Uppercase"+upper);
//         System.out.println("Lowercase"+lower);
        
//     }
// }

// 28. Find First Non-Repeated Character

public class BasiceString8 {
    public static void main(String[] args) {
        String str ="swiss";

        int [] count =new int[256];

        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)]==1){
                System.out.println("First non-repeated character:"+str.charAt(i));
                return;
            }
        }
        System.out.println("No non-repeated character found");
    }
}