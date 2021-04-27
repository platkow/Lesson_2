import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        String token = Solution.tokenGenerator();
        if (!(token.isEmpty())) {
            System.out.println("Your unique token is: " + token);
        } else {
            System.out.println("Token cannot be generated due to invalid user input value.");
        }
    }

    private static String tokenGenerator() {
        Random randomNumber = new Random();

        //Read token range from file
        String path = "C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\Token_TestData.txt";
        String dataRead;
        ArrayList<String> tokenDataSetCollection = new ArrayList<>();

        try {
            File tokenDataSet = new File(path);
            Scanner dataSet = new Scanner(tokenDataSet);
            while (dataSet.hasNext()) {
                dataRead = dataSet.nextLine();
                tokenDataSetCollection.add(dataRead);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        //token length user input
        System.out.println("Please enter integer 5, 10 or 15 to generate token with corresponding length.");

        int userTokenLength = 0;

        try {
            Scanner scanner = new Scanner(System.in);
            userTokenLength = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid data type provided.");
        }

        //Creating token based on collection. Token length dependent on user input.
        StringBuilder generatedToken = new StringBuilder();

        switch (userTokenLength) {
            case 5:
                System.out.println("User chose token with 5 characters.");
                for (int i = 0; i < userTokenLength; i++) {
                    String singleCharacter = tokenDataSetCollection.get(randomNumber.nextInt(tokenDataSetCollection.size()));
                    generatedToken.append(singleCharacter);
                }
                break;
            case 10:
                System.out.println("User chose token with 10 characters.");
                for (int i = 0; i < userTokenLength; i++) {
                    String singleCharacter = tokenDataSetCollection.get(randomNumber.nextInt(tokenDataSetCollection.size()));
                    generatedToken.append(singleCharacter);
                }
                break;
            case 15:
                System.out.println("User chose token with 15 characters.");
                for (int i = 0; i < userTokenLength; i++) {
                    String singleCharacter = tokenDataSetCollection.get(randomNumber.nextInt(tokenDataSetCollection.size()));
                    generatedToken.append(singleCharacter);
                }
                break;
        }
        String generatedTokenString = generatedToken.toString();
        return generatedTokenString;
    }
}








