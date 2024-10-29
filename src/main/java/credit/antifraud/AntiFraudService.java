package credit.antifraud;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AntiFraudService {
    private final HistoryService historyService;
    private final CbService cbService;

    public boolean isScammer(String fio) {
        return historyService.isScammer(fio) || cbService.isScammer(fio);
    }
}
