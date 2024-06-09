package core.rabbitmq;

import core.rabbitmq.dto.RabbitmqDTO;
import core.rabbitmq.publisher.RabbitmqProducer;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Lazy
@RestController
@RequestMapping("/rabbitmq")
public class MessageController {

    RabbitmqProducer rabbitmqProducer;

    public MessageController(RabbitmqProducer rabbitMQJsonProducer) {
        this.rabbitmqProducer = rabbitMQJsonProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody RabbitmqDTO user){
        rabbitmqProducer.sendJsonMessage(user);
        return ResponseEntity.ok("Json Message sent to RabbitMQ ...");
    }

}
