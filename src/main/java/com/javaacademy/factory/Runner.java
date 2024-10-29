package com.javaacademy.factory;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Map<String, Object> context = new HashMap<>();

        //Создавали объекты
        createWorker1(context);
        createWorker2(context);
        createFactory(context);

        //Запустили начало дня у созданной фабрики
        Factory factory = (Factory) context.get("spring_factory");
        factory.startDay();

        //----Работа нашей фабрики
        Brick brick = factory.createBrick();

        //Окончание работы фабрики
        factory.endDay();
        Worker worker1 = (Worker) context.get("worker1");
        worker1.sayMyMoney();
        Worker worker2 = (Worker) context.get("worker1");
        worker2.sayMyMoney();
    }

    private static void createWorker1(Map<String, Object> context) {
        Worker worker1 = new Worker("Петрович");
        context.put("worker1", worker1);
    }

    private static void createWorker2(Map<String, Object> context) {
        Worker worker2 = new Worker("Иваныч");
        context.put("worker2", worker2);
    }

    private static void createFactory(Map<String, Object> context) {
        Worker worker1 = (Worker) context.get("worker1");
        Worker worker2 = (Worker) context.get("worker2");

        Factory factory = new Factory(worker1, worker2);
        context.put("spring_factory", factory);
    }
}
