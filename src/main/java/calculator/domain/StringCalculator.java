package calculator.domain;

import java.util.Objects;

public class StringCalculator {

    public int add(String text) {
        if (isEmptyOrNull(text)) {
            return 0;
        }

        int result = 0;
        for(Integer number : Tokenizer.tokenize(text)) {
            result += number;
            if(number < 0 ) {
                throw new IllegalArgumentException("[ERROR] 음수는 입력할 수 없습니다.");
            }
        }

        return result;
    }

    private boolean isEmptyOrNull(String text) {
        return Objects.isNull(text) || text.isEmpty();
    }

}
