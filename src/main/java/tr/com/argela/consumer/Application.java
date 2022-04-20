package tr.com.argela.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import tr.com.argela.consumer.config.KafkaConsumerConfig;

@SpringBootApplication
public class Application {

	@Autowired
	KafkaConsumerConfig kafkaTopicConfig;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@EventListener(ApplicationReadyEvent.class)
	public void onRun(){
		System.out.println("Consumer is started");
		System.out.println("Kafka URL : "+ kafkaTopicConfig.getBootstrapAddress());
		System.out.println("Kafka Topic : "+ kafkaTopicConfig.getTopicName());
		System.out.println("Kafka group : "+ kafkaTopicConfig.getGroupName());

		System.out.println("Kafka partition: "+ kafkaTopicConfig.getPartitionSize());
	}

}
