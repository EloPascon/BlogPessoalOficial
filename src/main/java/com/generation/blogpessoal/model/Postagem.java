/**
 * 
 */
package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name= "tb_Postagens")
public class Postagem {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) //AUTO-INCREMENTE
  private Long id;
   
	@NotBlank(message="o atributo titulo é obrigatorio e não pode utilizar espaços em branco")
	@Size(min=5 , max= 100, message= "o atributo titulo deve conter no minimo 5 eno maximo 100 caracteres")
  private String titulo;
	
	@NotNull(message="o atributo texto é obrigatorio")
	@Size(min=10 , max= 1000, message= "o atributo texto deve conter no minimo 10 eno maximo 1000 caracteres")
  private String texto;
  
	@UpdateTimestamp
  private LocalDateTime data;

	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getTexto() {
	return texto;
}

public void setTexto(String texto) {
	this.texto = texto;
}

public LocalDateTime getData() {
	return data;
}

public void setData(LocalDateTime data) {
	this.data = data;
}

public Postagem getTema() {
	// TODO Auto-generated method stub
	return null;
}
  
  
	}


