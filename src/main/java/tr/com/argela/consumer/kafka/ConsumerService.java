package tr.com.argela.consumer.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;

import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

  private final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

  
  @KafkaListener(topicPartitions = @TopicPartition(topic = "${kafka.topic}", partitionOffsets = {
    @PartitionOffset(partition = "${kafka.partition.id}", initialOffset = "${kafka.partition.id}") }), groupId = "${kafka.group}")
  public void consume(String message) {
    logger.info("New Message: " + message);
  }

}
