package core.rabbitmq.publisher;

import core.rabbitmq.dto.RabbitmqDTO;
import core.utility.LoggingService;
import org.apache.log4j.Logger;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class RabbitmqProducer {

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.key.name}")
    private String routingJsonKey;

    private static Logger logger = LoggingService.getLogger(RabbitmqProducer.class);

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void sendJsonMessage(RabbitmqDTO user) {
        logger.info(String.format("Message sent -> %s", user.toString()));
        rabbitTemplate.convertAndSend(exchange, routingJsonKey, user);
    }

}
