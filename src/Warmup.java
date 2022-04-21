public class Warmup {

    public static void main(String[] args) {

        isPalindrome("jordan");
        isPalindrome("hannah");

    }

    public static boolean isPalindrome(String word) {
        int n = word.length();
        for (int i = 0; i < (n/2); i++) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                System.out.println("This is not a palindrome.");
                return false;
            }
        }
        System.out.println("This is a palindrome.");
        return true;
    }
}
