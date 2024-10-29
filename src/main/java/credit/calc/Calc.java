package credit;


import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Random;

@Component
public class Calc {
    private static final Random RANDOM = new Random(1);

    public BigDecimal creditAmount() {
        return BigDecimal.valueOf(RANDOM.nextDouble(1000, 100_000));
    }
}
