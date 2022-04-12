package tr.com.argela.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
		// Logger logger = LoggerFactory.getLogger(ConsumerApplication.class.getName());
		// String bootstrapServers="192.168.231.241:9092";
		// String grp_id="kus";
		// String topic="otme";

		// Properties properties = new Properties();
		// properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
		// bootstrapServers);
		// properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
		// StringDeserializer.class.getName());
		// properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
		// StringDeserializer.class.getName());
		// properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, grp_id);
		// properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

		// KafkaConsumer<String,String> consumer = new
		// KafkaConsumer<String,String>(properties);
		// consumer.subscribe(Arrays.asList(topic));
		// while(true){
		// ConsumerRecords<String,String> records=consumer.poll(Duration.ofMillis(100));
		// for(ConsumerRecord<String,String> record: records){
		// logger.info("Key: "+ record.key() + ", Value:" +record.value());
		// logger.info("Partition:" + record.partition()+",Offset:"+record.offset());
		// }
		// }
	}
}
