package credit.antifraud;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class HistoryService {
    private Map<String, Boolean> clients = new HashMap<>();

    @PostConstruct
    public void fillData() {
        clients.put("Петров Петр Петрович", true);
    }

    public boolean isScammer(String fio) {
        if (!clients.containsKey(fio)) {
            return false;
        }
        return clients.get(fio);
    }
}
