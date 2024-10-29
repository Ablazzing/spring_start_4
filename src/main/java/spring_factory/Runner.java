package spring_factory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        //Подготовительная стадия
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("spring_factory");
        Factory factory = context.getBean(Factory.class);
        //Конец подготовительной стадии

        //Фаза работы приложения
        Brick brick = factory.createBrick();

        //Конец рабочего дня
        context.close();
    }

}
