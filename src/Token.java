import java.util.Random;

public class Token {

    private String tokenColor;

    private final String[] colors = {"blue", "yellow", "green", "red",
            "orange"};

    //Constructor
    public Token()
    {
        this.tokenColor = findColor();
    }

    //Getter
    public String getTokenColor()
    {
        return this.tokenColor;
    }

    //Class methods
    private int randomColor()
    {
        int intColor;
        intColor = new Random().nextInt(5);
        return intColor;
    }

    public String findColor()
    {
        int color = randomColor();
        String tokenColor;
        tokenColor = this.colors[color];
        return tokenColor;
    }

    public String toString()
    {
        String s;
        s = tokenColor;
        return s;
    }



}
