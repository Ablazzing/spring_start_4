package credit;

import credit.antifraud.AntiFraudService;
import credit.calc.Calc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class CreditService {
    private final Calc calc;
    private final AntiFraudService antiFraudService;

    public BidResponse calculateBig(BidRequest request) {
        if (antiFraudService.isScammer(request.getFio())) {
            return new BidResponse(false);
        }
        BigDecimal creditAmount = calc.creditAmount();
        return new BidResponse(true, creditAmount);
    }

}
