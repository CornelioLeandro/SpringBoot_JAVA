package com.cornelioleandro.course.config;

import java.lang.reflect.Array;
import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cornelioleandro.course.entities.Category;
import com.cornelioleandro.course.entities.Order;
import com.cornelioleandro.course.entities.User;
import com.cornelioleandro.course.entities.enums.OrderStatus;
import com.cornelioleandro.course.repositories.CategoryRepository;
import com.cornelioleandro.course.repositories.OrderRepository;
import com.cornelioleandro.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		User u1= new User(null, "Leandro Cornelio", "cornelio@gmail.com", "981301912","125874");
		User u2= new User(null, "Clber Cornelio", "clber@gmail.com", "981301912","125874");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID,u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.SHIPPED, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT,u1); 
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
	
	}
	
	
}
