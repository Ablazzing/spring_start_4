package spring_factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FactoryImpl extends Factory {


    public FactoryImpl(Worker worker1, Worker worker2) {
        super(worker1, worker2);
    }


    @Override
    public Brick createBrick() {
        log.info("Начат вызов метода кирпича");
        return super.createBrick();
        //log.info("Закончен вызов метода создания кирпича");
    }
}
