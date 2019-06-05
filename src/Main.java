import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        SecretCode  secretCode = new SecretCode();
        Token [] tokenCode = new Token[4];
        Token singleToken;
        String tokenColor;
        String [] userAnswer = new String[4];
        int tokenPosition;


        secretCode.secretCode();
        secretCode.getCodeWithTokens();

        for(int i = 1; i < 5; i++)
        {
            userAnswer = userInput(i, userAnswer);
        }

        for (int i = 0; i < 4; i++)
        {
            tokenColor = userAnswer[i];
            System.out.print(tokenColor + ", ");
        }
        System.out.println("\n" +
                secretCode);
        System.out.println(secretCode.getSingleToken(3));
    }
/*
    public static Token [] secretCode() {
        Token [] secretCode = {null, null, null, null};
        int [] numberCode;
        int tokenColor;
        int position;
        Token token;
        Random randomColor = new Random();

        numberCode = produceCode();


        for(int i = 0; i < 4; i++) {
            position = numberCode[i];
            tokenColor = randomColor.nextInt(5);
            token = new Token(tokenColor, position);
            secretCode[i] = token;
        }
        return secretCode;
    }

    public static int [] produceCode() {
        int [] code = {-1, -1, -1, -1};
        int number = 0;
        int codeNumber;
        Random randomNum = new Random();

        while(number < 4){
            codeNumber = randomNum.nextInt(4);
            if(!contains(code, codeNumber)) {
                code[number] = codeNumber;
                number++;
            }
        }
        return code;
    }

    private static boolean contains(int [] list, int number) {
        boolean doesContain = false;

        for(int i = 0; i < list.length; i++) {
            if(number == list[i]) {
                doesContain = true;
            }
        }
        return doesContain;
    }*/


    public static String [] userInput(int position, String [] userAnswer) {
        String usersInput;
        Scanner input = new Scanner(System.in);

        System.out.println("Color list: blue, yellow, green, red, orange");

        System.out.print("\n Enter a color for code position " + position + ": ");
        usersInput = input.nextLine();
        userAnswer[position - 1] = usersInput;

        return userAnswer;
    }

}
