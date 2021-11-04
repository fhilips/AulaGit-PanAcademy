package com.springmongodb.mongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongodb.mongodb.model.Consulta;
import com.springmongodb.mongodb.model.Medico;
import com.springmongodb.mongodb.repository.ConsultaRepository;
import com.springmongodb.mongodb.repository.MedicoRepository;


@Service
public class ConsultaServiceImpl implements ConsultaService {

	@Autowired
	ConsultaRepository consultaRepository;
	
	@Autowired
	MedicoRepository medicoRepository;
	
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
		
		this.medicoRepository.save(consulta.getMedico());
//
//		Medico medico = this.medicoRepository
//							.findById(consulta.getMedico().getId())
//							.orElseThrow(() -> new IllegalArgumentException("Médico inexistente"));
		
//		consulta.setMedico(medico);							
		return this.consultaRepository.save(consulta);
	}

	@Override
	public Consulta atualizar(String id, Consulta consultaAtualizada) {
		Consulta consulta = obterPorCod(id);	
		
		consulta.setMedico(consultaAtualizada.getMedico());
		consulta.setNomePaciente(consultaAtualizada.getNomePaciente());
		consulta.setDataAgendamento(consultaAtualizada.getDataAgendamento());
		
		return this.consultaRepository.save(consulta);		
	}
		
}
