package com.javaacademy.factory;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Factory {
    private static final BigDecimal ONE_DAY_SALARY = BigDecimal.valueOf(5000);
    private Worker worker1;
    private Worker worker2;


    public Factory(Worker worker1, Worker worker2) {
        this.worker1 = worker1;
        this.worker2 = worker2;
    }

    public void startDay() {
        log.info("Смена началась!");
    }

    public Brick createBrick() {
        log.info("Произведен кирпич!");
        return new Brick();
    }

    public void endDay() {
        worker1.takeSalary(ONE_DAY_SALARY);
        worker2.takeSalary(ONE_DAY_SALARY);
        log.info("Смена закончилась");
    }
}
