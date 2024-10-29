package spring_factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.math.BigDecimal;

@Slf4j
@Component
public class Factory {
    private static final BigDecimal ONE_DAY_SALARY = BigDecimal.valueOf(5000);
    private Worker worker1;
    private Worker worker2;


    public Factory(@Qualifier("worker1") Worker worker1, @Qualifier("worker2") Worker worker2) {
        this.worker1 = worker1;
        this.worker2 = worker2;
    }

    @PostConstruct
    public void startDay() {
        log.info("Смена началась!");
    }


    public Brick createBrick() {
        log.info("Произведен кирпич!");
        return new Brick();
    }

    @PreDestroy
    public void endDay() {
        worker1.takeSalary(ONE_DAY_SALARY);
        worker2.takeSalary(ONE_DAY_SALARY);
        log.info("Смена закончилась");
    }
}
