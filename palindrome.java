public class Main {
    public static void main(String[] args) {
        String name = "Madam";

        int start = 0;
        int end = name.length() - 1;
        boolean isPalindrome = true;

        while (start < end) 
            {
            if (name.charAt(start) != name.charAt(end)) 
                {
                isPalindrome = false;
                break;
            } 
            else 
                {
                start++;
                end--;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}