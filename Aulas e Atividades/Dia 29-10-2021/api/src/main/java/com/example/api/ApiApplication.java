package com.example.api;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.api.model.Produto;
import com.example.api.model.Usuario;
import com.example.api.repositories.ProdutoRepository;
import com.example.api.repositories.UsuarioRepository;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner{

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	ProdutoRepository produtoRepository;
		
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario("Maria Silva", "1234");
		Usuario u2 = new Usuario("Joao da Silva", "1234");
		
		Produto p1 = new Produto("Bolacha", 2.99, 10l);
		Produto p2 = new Produto("Leite", 3.99, 10l);
		
		usuarioRepository.saveAll(Arrays.asList(u1, u2));
		produtoRepository.saveAll(Arrays.asList(p1, p2));
	}

}
