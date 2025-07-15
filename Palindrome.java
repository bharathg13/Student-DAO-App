public class Palindrome {

    public static void main(String[] args) {
        int num = 12321; // The number to check
        int originalNum = num; // Store the original number
        int reversedNum = 0;
        int remainder;

        // Reverse the number
        while (num > 0) {
            remainder = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + remainder; // Build the reversed number
            num /= 10; // Remove the last digit from the original number
        

        // Check if the original number is equal to the reversed number
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }
    }
}

