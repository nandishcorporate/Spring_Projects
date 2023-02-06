package com.cg.sms.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name="DEPARTMENT")
@JsonIgnoreProperties(value = {"students"}, allowSetters =  true)
public class Department implements Serializable {
	
	private static final long serialVersionUID = 153289245231121258L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@NotBlank(message = "Name is required")
	@Column(name = "NAME")
	private String name;
	
	@OneToMany(mappedBy = "department") 
	private List<Student> students;

}
