package spring_factory;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.math.BigDecimal;

@Data
@Slf4j
public class Worker {
    private final String name;
    private BigDecimal money = BigDecimal.ZERO;

    public void takeSalary(BigDecimal salary) {
        money = money.add(salary);
    }

    @PreDestroy
    public void sayMyMoney() {
        log.info("{} заработал: {}", name, money);
    }
}
