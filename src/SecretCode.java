
public class SecretCode {

    private Token [] codeWithTokens;

    public SecretCode() {
        this.codeWithTokens = secretCode();
    }

    public Token [] secretCode()
        {
        Token [] tokenCode = new Token[4];
        int tokenColor;
        Token token;


        for(int i = 0; i < 4; i++)
        {
            token = new Token();
            tokenCode[i] = token;
        }
        return tokenCode;
    }

    public Token [] getCodeWithTokens()
        {
            return this.codeWithTokens;
        }

    public Token getSingleToken(int token)
    {
        return this.codeWithTokens[token];
    }


    @Override
    public String toString()
    {
        Token singleToken = new Token();
        String allTokens = "";

        for(int i = 0; i < codeWithTokens.length; i++)
        {
            singleToken = codeWithTokens[i];
            allTokens += singleToken + " ";
        }
        return allTokens;
    }
}
