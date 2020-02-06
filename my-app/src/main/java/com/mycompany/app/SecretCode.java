
public class SecretCode {

    private Token [] codeWithTokens;
    private boolean [] answerCompared = {false, false, false, false};

    public SecretCode() {
        this.codeWithTokens = secretCode();
    }

    public Token [] secretCode()
        {
        Token [] tokenCode = new Token[4];
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

    public boolean [] compareAnswerWithCode(String answer)
    {

        String codeToCompare = "";

        for(int i = 0; i < this.codeWithTokens.length; i++)
        {
            codeToCompare += this.codeWithTokens[i];
            if(answer.equals(codeToCompare))
            {
                answerCompared[i] = true;
            }
        }
        return answerCompared;
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
