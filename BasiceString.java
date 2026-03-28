// 16. Convert Each Word to Uppercase First Letter (Title Case)

// public class BasiceString {
//     public static void main(String[] args) {
//         String s ="java is fun";
//         String[] a =s.split(" ");
//         String result ="";

//         for(String string : a){
//             result +=(string.charAt(0)+"")
//             .toUpperCase()+
//             string.substring(1)+" ";

//         }
//         System.out.println(result.trim());
//     }
// }

// 16. Convert Each Word to Uppercase Last Letter (Title Case)

public class BasiceString {
    public static void main(String[] args) {
        String s ="java is fun";
        String [] b =s.split(" ");
        String result ="";

        for(String string : b){
            result +=string.substring(0,string.length()-1 )+
            (string.charAt(string.length()-1)+"")
            .toUpperCase()+" ";
        }
        System.out.println(result.trim());
    }
}

