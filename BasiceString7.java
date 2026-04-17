// 20. Remove Duplicate Characters

public class BasiceString7 {
    public static void main(String[] args) {
        String str = "programmer";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
