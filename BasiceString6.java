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
// public class BasiceString6 {
//     public static void main(String[] args) {
//     String str ="Java is cool";
//     String result = str.replaceAll("\\s","");
//     System.out.println(result);
//     }
// }

// 16 Right rotate the array by one
public class BasiceString6 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4};
        int n =arr.length;

        int temp =arr[n-1];

        for(int i = n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0]=temp;

        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
