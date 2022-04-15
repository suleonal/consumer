package tr.com.argela.consumer;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

public class KafkaTopicConfig {

    @Bean
    public NewTopic otme() {
        return TopicBuilder.name("otme")
                .partitions(3)
                .replicas(3)
                .build();
    }

    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "0.0.0.0:9092");
        return new KafkaAdmin(configs);
    }
}
