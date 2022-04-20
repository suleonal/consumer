package tr.com.argela.consumer.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class KafkaTopicConfig {

    @Autowired
    KafkaConsumerConfig config;

    @Bean
    public NewTopic topic1() {
        return TopicBuilder.name(config.getTopicName())
                .partitions(config.getPartitionSize())
                .replicas(1)
                .build();
    }

}
