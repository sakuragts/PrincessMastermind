
import java.util.Scanner;
//test git commit
public class Main {

    public static void main (String[] args) {
        SecretCode  secretCode = new SecretCode();
        Token [] tokenCode = new Token[4];
        Token singleToken;
        String tokenColor;
        String singleAnswer;
        String [] userAnswer = new String[4];
        int tokenPosition;




        System.out.println("Color list: blue, yellow, green, red, orange");
        printAnswer(secretCode, userAnswer);

        for(int i = 0; i < userAnswer.length; i++)
        {
            secretCode.compareAnswerWithCode(userAnswer[i]);
        }
        //System.out.println(secretCode.getSingleToken(3));
    }

    public static String [] userInput(int position, String [] userAnswer) {
        String usersInput;
        Scanner input = new Scanner(System.in);

        System.out.print("\n Enter a color for code position " + position + ": ");
        usersInput = input.nextLine();
        userAnswer[position - 1] = usersInput;

        return userAnswer;
    }

    public static void printAnswer(SecretCode secretCode, String [] userAnswer)
    {
        String tokenColor;
        for(int i = 1; i < 5; i++)
        {
            userAnswer = userInput(i, userAnswer);
        }

        for (int i = 0; i < 4; i++)
        {
            tokenColor = userAnswer[i];
            if(i < 4)
            {
                System.out.print(tokenColor + ", ");
            }
        }
        System.out.println("\n" +
                secretCode);
    }

    /*public static boolean [] verifyAnswerColor(String [] userAnswer)
    {
        boolean [] answersCompared = new boolean[4];
        SecretCode codeToString = new SecretCode();
        String codeToCompare = "";

        codeToString.getCodeWithTokens();

        for(int i = 0; i < userAnswer.length; i++)
        {
            codeToCompare += secretCode[i];
            if(answer.equals(codeToCompare))
            {
                answerCompared[i] = true;
            }
        }
        return answerCompared;

        return true;
    }
    */
}
