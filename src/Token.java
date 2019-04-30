

public class Token {

    private String [] colors = {"blue", "yellow", "green", "red", "orange"};
    private int position;
    private String tokenColor;

    public Token (int color, int position) {
        if (color >= 0 && color < 5) {
            this.tokenColor = colors[color];
        }
        if(position >= 0 && position < 4) {
            this.position = position;
        }
    }

    public String getTokenColor() {
        return this.tokenColor;
    }

    public int getPosition() {
        return this.position;
    }



}
