public class RemoveDublicateElement {
    public static void main(String[] args) {
        String name = "allamgowthamsaibabu";

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < name.length(); i++) {
            if (sb.indexOf(name.charAt(i) + "") == -1) {
                sb.append(name.charAt(i));
            }
        }
        System.out.println(sb);

        for (int i = 0; i < sb.length(); i++) {
            int count = 0;
            for (int j = 0; j < name.length(); j++) {
                if (sb.charAt(i) == name.charAt(j)) {
                    count++;
                }
            }
            System.out.println(sb.charAt(i) + " : " + count);
        }
    }
}
