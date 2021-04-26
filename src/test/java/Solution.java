import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        String token = Solution.tokenGenerator();
        System.out.println("Your unique token is: " + token);

    }

    private static String tokenGenerator() {
        String lowLetters = "abcdefghijklmnopqrstuvwxyz";
        String bigLetters = lowLetters.toUpperCase();
        String numbers = "123456789";
        String specialSigns = "!@#$%^&*()";

        Random randomNumber = new Random();

        //build token range
        StringBuilder tokenRange = new StringBuilder();
        tokenRange.append(lowLetters)
                .append(bigLetters)
                .append(numbers)
                .append(specialSigns);

        String tokenRangeString = tokenRange.toString();

        //token length user input
        System.out.println("Please enter value 5, 10 or 15 to generate token with corresponding length.");

        Scanner scanner = new Scanner(System.in);
        int userTokenLength = scanner.nextInt();

        //Creating token from single characters. Token length dependent on user input.
        StringBuilder generatedToken = new StringBuilder();

        for (int i = 0; i < userTokenLength; i++) {
            String singleCharacter = String.valueOf(tokenRangeString.charAt(randomNumber.nextInt(tokenRangeString.length())));
            generatedToken.append(singleCharacter);
        }

        String generatedTokenString = generatedToken.toString();

        return generatedTokenString;
    }
}







