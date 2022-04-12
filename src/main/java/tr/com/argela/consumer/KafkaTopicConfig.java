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
    public NewTopic otme(){
        return TopicBuilder.name("otme")
               .partitions(1)
               .replicas(1)
               .build();
    }

    @Bean
    public KafkaAdmin kafkaAdmin() 
	{
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.231.241:9092");
        return new KafkaAdmin(configs);
    }
}
