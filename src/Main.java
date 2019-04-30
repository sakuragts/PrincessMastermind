import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Random;

public class Main {

    public static void main (String[] args) {
        Token [] secretCode = null;
        Token singleToken;
        String tokenColor;
        int tokenPosition;

        secretCode = secretCode();
        singleToken = secretCode[0];

        System.out.println(singleToken.getPosition());


    }

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
    }


    public static void testImage() {
        File testImage = null;
        BufferedImage bRibbon = null;

        try {
            testImage = new File("C:\\PrincessMastermind\\src\\yellowribbon.png");
            bRibbon = ImageIO.read(testImage);


            ImageIO.write(bRibbon, "jpg", new File("C:" +
                    "\\PrincessMastermind\\src\\testImage.jpg"));
        } catch (IOException e) {
            System.out.print("Error, no image");
        }
    }
}
