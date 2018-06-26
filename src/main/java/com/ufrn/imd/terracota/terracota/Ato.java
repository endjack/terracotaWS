package com.ufrn.imd.terracota.terracota;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table
public class Ato implements Serializable{
		
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_ato")
	@JsonProperty("id_ato")
	public Integer id;
	
	@Column(name = "title")
	@JsonProperty("title")
	String titulo;
	
	@Column(name = "description")
	@JsonProperty("description")
	String descricao;
	
	public Ato(){		
	}
	
	public Ato(Integer id, String titulo, String descricao) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	

}
