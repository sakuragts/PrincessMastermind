import java.util.Scanner;

public class UserAnswer {

    private String [] userAnswerList;
    private String userAnswer;
    private int position;

    public String [] getUserAnswer() {
        return userAnswerList;
    }

    public String userInput(int position) {
        Scanner input = new Scanner(System.in);

        System.out.print("\n Enter a color for code position " + position + ": ");
        this.userAnswer = input.nextLine();
        return this.userAnswer;
    }

    public String [] makingUserAnswerList() {
        for (this.position = 1; this.position < 5; this.position++) {

        }
    }
}
