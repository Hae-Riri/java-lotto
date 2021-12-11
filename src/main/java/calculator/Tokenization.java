package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenization {

    private static final String TOKEN_DELIMITER = ",|:";
    private static final String REG_EXP = "//(.)\n(.*)";

    public String[] splitedExpression(String expression) {
        Matcher matcher = Pattern.compile(REG_EXP).matcher(expression);
        String delimiter = TOKEN_DELIMITER;

        if (matcher.find()) {
            delimiter = matcher.group(1);
            expression = matcher.group(2);
        }

        return expression.split(delimiter);
    }

}
