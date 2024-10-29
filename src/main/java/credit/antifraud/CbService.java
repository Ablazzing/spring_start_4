package credit.antifraud;

import org.springframework.stereotype.Component;

@Component
public class CbService {

    public boolean isScammer(String fio) {
        return fio.toLowerCase().startsWith("а");
    }
}
