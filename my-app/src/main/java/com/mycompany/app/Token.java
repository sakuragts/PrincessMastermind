import java.util.Random;

public class Token {

    private String tokenColor;

    public Token()
    {
        this.tokenColor = findColor();
    }

    public String getTokenColor()
    {
        return this.tokenColor;
    }

    private int randomColor()
    {
        int intColor;
        Random randomColor = new Random();
        intColor = randomColor.nextInt(5);
        return intColor;
    }

    public String findColor()
    {
        int color = randomColor();
        String tokenColor;
        String [] colors = {"blue", "yellow", "green", "red",
                "orange"};
        tokenColor = colors[color];
        return tokenColor;
    }

    public String toString()
    {
        String s;
        s = tokenColor;
        return s;
    }



}
