for a in {1..5};do 
 	echo nebi_consumer_$a;  
	docker logs nebi_consumer_$a ; 
done | grep -e nebi_consumer -e Message| grep -v KafkaMessageListenerContainer
