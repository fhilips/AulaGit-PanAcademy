package com.example.api.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.model.Produto;
import com.example.api.repositories.ProdutoRepository;
import java.util.List;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	public Produto findById(Long id) {
		Optional<Produto> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public List<Produto> findAll() {
		return repository.findAll();
	}

	public Produto update(Long id, Produto obj) {
		Produto newObj = findById(id);
		newObj.setNome(obj.getName());
		;
		newObj.setQuantidade(obj.getQuantidade());
		;
		newObj.setValor(obj.getValor());
		return repository.save(newObj);
	}

	public void delete(Long id) {
		findById(id);
		repository.deleteById(id);
	}

	public Produto create(Produto obj) {
		obj.setId(null);
		return repository.save(obj);
	}

}
