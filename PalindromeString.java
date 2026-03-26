// public class PalindromeString {
//     public static void main(String[] args) {
//         String name = "madam";
//         String reverse = "";

//         for (int i = name.length() - 1; i >= 0; i--) {
//             reverse += name.charAt(i);
//         }
//         if (name.equals(reverse)) {
//             System.out.println("Palindrome String");
//         } else {
//             System.out.println("Not a palindrome String");
//         }
//     }
// }

// Method 2: Using two pointers

public class PalindromeString {
    public static void main(String[] args) {
        String name = "madam";
        boolean isPalindrome = true;
        int start = 0;
        int end = name.length() - 1;

        while (start < end) {
            if (name.charAt(start) != name.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println("ispalindrome");
        } else {
            System.out.println("not a is palindrome");
        }
    }
}