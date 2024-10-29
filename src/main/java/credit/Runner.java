package credit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("credit");
        CreditService creditService = context.getBean(CreditService.class);

        BidResponse failureResponse = creditService.calculateBig(new BidRequest("Акопян Амояк Владимирович"));
        log.info(failureResponse.toString());
        BidResponse successResponse = creditService.calculateBig(new BidRequest("Иванов Иван Владимирович"));
        log.info(successResponse.toString());

    }
}
