// 20. Remove Duplicate Characters

// public class BasiceString7 {
//     public static void main(String[] args) {
//         String str = "programmer";
//         String result = "";

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (result.indexOf(ch) == -1) {
//                 result += ch;
//             }
//         }
//         System.out.println(result);
//     }
// }

// 21. Find Duplicate Characters

public class BasiceString7 {
    public static void main(String[] args) {
        String str ="banana";

        int count [] =new int [256];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
            
        }
        for(int i=0;i<256;i++){
            if(count[i]>1){
                System.out.println((char)i+" ");
            }
        }
    }
}