import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class Main {

    public static void main (String[] args) {

        testImage();


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
