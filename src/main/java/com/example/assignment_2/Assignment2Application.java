package com.example.assignment_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.assignment_2.entity.Address;
import com.example.assignment_2.entity.User;
import com.example.assignment_2.repository.AddressRepository;
import com.example.assignment_2.repository.UserRepository;

@SpringBootApplication
public class Assignment2Application implements CommandLineRunner {
	// create logger
	private final Logger logger = LoggerFactory.getLogger(Assignment2Application.class);

	// inject beans
	@Autowired
	private UserRepository userRepository; // will be used when saving stand alone user

	@Autowired
	private AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(Assignment2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// create first user
		User user = new User();
		user.setName("john");
		user.setEmail("johndoe@gmail.com");
		user.setPassword("1234");

		// create address for first user
		Address address = new Address();
		address.setCountry("indonesia");
		address.setState("jawa barat");
		address.setCity("bogor");
		address.setStreet("jl. mawar no. 30");
		address.setZipCode("0102");
		address.setUser(user); // relation to user table

		// saves address and automatically saves user model to users table
		addressRepository.save(address);
		logger.info("save data successful");
	}
}
