package com.diego.uri2615;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diego.uri2615.dto.CustomerMinDTO;
import com.diego.uri2615.projections.CustomerMinProjection;
import com.diego.uri2615.repositories.CustomerRepository;

@SpringBootApplication
public class Uri2615Application implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Uri2615Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<CustomerMinProjection> list = repository.search1();
		List<CustomerMinDTO> result1 = list.stream().map(x -> new CustomerMinDTO(x)).collect(Collectors.toList());

		System.out.println("\n*** SQL:");
		for (CustomerMinDTO obj : result1) {
			System.out.println(obj);
		}
		System.out.println("\n\n\n");

	}

}
