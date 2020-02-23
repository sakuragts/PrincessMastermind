import java.util.Arrays;
import java.util.Scanner;

public class UserAnswer {

    private String [] userAnswerList = {"a","b","c","d"};
    private String userAnswer;

    public String [] getUserAnswer() {
        return userAnswerList;
    }

    public void userInput(int position) {
        Scanner input = new Scanner(System.in);

        System.out.print("\n Enter a color for code position " + position + ": ");
        this.userAnswer = input.nextLine();
    }

    public void makingUserAnswerList() {
        int position;
        for (position = 1; position < 5; position++) {
            userInput(position);
            userAnswerList[position - 1] = userAnswer;
        }
    }

    @Override
    public String toString() {
        return "User color list = " + Arrays.toString(userAnswerList);
    }
}
