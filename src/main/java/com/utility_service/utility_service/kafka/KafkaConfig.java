package core.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.kafka.config.TopicBuilder;

//@Configuration
public class KafkaConfig {

//    @Bean
    public NewTopic newTopic(){
        return TopicBuilder.name(AppConstants.LOCATION_TOPIC_NAME).build();
    }
}
