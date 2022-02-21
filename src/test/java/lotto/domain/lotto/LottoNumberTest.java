package lotto.domain.lotto;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class LottoNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, 100})
    void 로또넘버의_범위가_1과_45_사이가_아니라면_예외처리(int number) {
        assertThatThrownBy(() -> new LottoNumber(number))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("[ERROR] 로또 번호는 1-45 이내의 숫자여야 합니다.");
    }
}
