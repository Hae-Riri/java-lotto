package lotto.service;

import java.util.List;
import lotto.domain.Lotto;
import lotto.domain.LottoResult;
import lotto.domain.WinningBall;

public class LottoMachine {

    private static List<LottoResult> results;

    public static void run(List<Lotto> lottoNumbers, List<WinningBall> winningBalls) {
        WinningCounter winningCounter = new WinningCounter(lottoNumbers, winningBalls);
        results = winningCounter.getTotalLottoResult();
    }

    public static List<LottoResult> getResults() {
        return results;
    }
}
