package RevertString;

public class Reverter {

    public static void main(String[] args) {
        String str = "Hello Instagram!";
        System.out.println(str);
        System.out.println(reverse(str));
    }
    
    private static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
