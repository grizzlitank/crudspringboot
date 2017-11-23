package com.example.crudspringboot;

import com.example.crudspringboot.domain.Post;
import com.example.crudspringboot.domain.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudspringbootApplication implements CommandLineRunner{

	@Autowired
	private PostRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CrudspringbootApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		for (int i = 0; i < 5; i++) {
			repository.save(new Post("My post number #" + (i)));
		}
	}
}
