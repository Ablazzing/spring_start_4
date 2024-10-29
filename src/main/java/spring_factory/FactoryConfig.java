package spring_factory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryConfig {

    @Bean
    public Worker worker2() {
        return new Worker("Петрович");
    }

    @Bean
    public Worker worker1() {
        return new Worker("Петрович");
    }
}
