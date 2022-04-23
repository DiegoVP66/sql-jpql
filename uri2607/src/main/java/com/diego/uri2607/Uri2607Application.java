package com.diego.uri2607;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diego.uri2607.dto.ProviderMinDTO;
import com.diego.uri2607.projections.ProviderMinProjection;
import com.diego.uri2607.repositories.ProviderRepository;

@SpringBootApplication
public class Uri2607Application implements CommandLineRunner {

	@Autowired
	private ProviderRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Uri2607Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<ProviderMinProjection> list = repository.search1();
		List<ProviderMinDTO> result1 = list.stream().map(x -> new ProviderMinDTO(x)).collect(Collectors.toList());

		System.out.println("\n***SQL RAIZ");
		for (ProviderMinDTO obj : result1) {
			System.out.println(obj);
		}
		System.out.println("\n\n\n");

		List<ProviderMinDTO> result2 = repository.search2();

		System.out.println("\n***JPQL");
		for (ProviderMinDTO obj : result2) {
			System.out.println(obj);
		}

	}

}
