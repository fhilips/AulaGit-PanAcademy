package com.springmongodb.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongodb.mongodb.model.Consulta;
import com.springmongodb.mongodb.repository.ConsultaRepository;


@Service
public class ConsultaServiceImpl implements ConsultaService {

	@Autowired
	ConsultaRepository consultaRepository;
	
	@Override
	public List<Consulta> obterTodos() {
		return this.consultaRepository.findAll();
	}

	@Override
	public Consulta obterPorCod(String cod) {
		return this.consultaRepository
				.findById(cod)
				.orElseThrow(() -> new IllegalArgumentException("Consulta inexistente!"));
	}

	@Override
	public Consulta criar(Consulta consulta) {

		return this.consultaRepository.save(consulta);
	}
		
}
