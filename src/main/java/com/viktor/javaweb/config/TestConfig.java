package com.viktor.javaweb.config;


import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.viktor.javaweb.entities.Category;
import com.viktor.javaweb.entities.Order;
import com.viktor.javaweb.entities.Product;
import com.viktor.javaweb.entities.User;
import com.viktor.javaweb.entities.enums.OrderStatus;
import com.viktor.javaweb.repositories.CategoryRepository;
import com.viktor.javaweb.repositories.OrderRepository;
import com.viktor.javaweb.repositories.ProductRepository;
import com.viktor.javaweb.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
	
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
		Product p1 = new Product(null, "Anker Wireless Charger, PowerWave Pad Upgraded ", "10W Max, 7.5W for iPhone 11, 11 Pro, 11 Pro Max, Xs Max, XR, XS, X, 8, 8 Plus, 10W Fast-Charging Galaxy S10 S9 S8, Note 10 Note 9 Note 8 (No AC Adapter)", 13.5, "");
		Product p2 = new Product(null, "Java SE 8 Programmer Certification Kit", "OCA / OCP Java SE 8 Programmer Certification Kit: Exam 1Z0-808 and Exam 1Z0-809", 43.0, "");
		Product p3 = new Product(null, "HISENSE H50B7100UK 50-Inch 4K UHD HDR Smart TV with Freeview Play (2019) [Energy Class A]", "4K Ultra HD - stunningly realistic picture quality and pin-sharp clarity.\r\n" + 
				"HDR technology - dramatically enhances detail by maximising contrast and colour accuracy.\r\n" + 
				"DTS Studio Sound - volume levelling, bass enhancement, speaker EQ and dialog enhancement technology.", 1250.0, "");
		Product p4 = new Product(null, "Sonos One SL ", "The Speaker for Stereo Pairing and Home Theatre Surrounds, Black.", 160.0, "");
		Product p5 = new Product(null, "Apple Airpods with Charging Case (latest Model)", "The new AirPods combine intelligent design with breakthrough technology and crystal clear sound. Powered by the new Apple H1 headphone chip, AirPods now feature hands-free access to Siri using just your voice. And up to 3 hours of talk time on a single charge", 160.99, "");
		
			
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User (null, "Viktor Maciel", "viktor.maciel@gmaikl.com", "8595653243", "1231213");
		
		
		Order o1 = new Order(null, Instant.parse("2020-01-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2020-01-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2020-01-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
	}

}
