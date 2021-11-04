package com.springmongodb.mongodb.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document() // registro de um colecao
public class Consulta implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String nomePaciente;
	private Double nomeMedico;
	
		
	public Consulta(String id, String nomePaciente, Double nomeMedico) {
		this.id = id;
		this.nomePaciente = nomePaciente;
		this.nomeMedico = nomeMedico;		
	}

	public Consulta() {		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public Double getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(Double nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

}
