public class ReverseString {



    public static String reverseString(String string) {
        if (string == null) return null;
        string = string.trim();
        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString = reverseString + string.charAt(i);
        }
        return reverseString;


    }
}
