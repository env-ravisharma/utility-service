package core.rabbitmq.consumer;

import core.rabbitmq.dto.RabbitmqDTO;
import core.rabbitmq.publisher.RabbitmqProducer;
import core.utility.LoggingService;
import org.apache.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;


@Service
@Lazy
public class RabbitmqConsumer {

    private static Logger logger = LoggingService.getLogger(RabbitmqProducer.class);

    @RabbitListener(queues = {"${rabbitmq.queue.name}"})
    public void consume(RabbitmqDTO rabbitmqDTO) {
        logger.info(String.format("Message Received -> %s", rabbitmqDTO.toString()));
    }

}