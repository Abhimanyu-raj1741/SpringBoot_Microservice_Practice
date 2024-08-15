package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Order;
import in.ashokit.constants.AppConstants;

@Service
public class OrderService {
    
	@Autowired
	private KafkaTemplate<String,Order> kafkaTemplate;
	
	public String createOrder(Order order) {
		kafkaTemplate.send(AppConstants.TOPIC,order);
		
		
		return "Order Created in kafka topic";
	}
	
}
