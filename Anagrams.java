public class Anagrams {
    public static void main(String[] args) {
        String str1 ="listen";
        String str2 ="silent";

        int count [] =new int[26];

        for(int i =0;i<str1.length();i++){
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        boolean isAnagram = true;

        for(int c :count){
            if(c!=0){
                isAnagram = false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not a Anagrams");
        }
    }
}
