package com.cg.sms.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity
@Table(name = "STUDENT_INFO")
public class Student implements Serializable {

	private static final long serialVersionUID = 7933967328942319086L;

	@NotBlank(message = "Name is required")
	@Column(name = "STUDENT_NAME")
	private String name;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer rollNumber;
	
	@Email(message = "Email must be xxxx@xxx.xxx")
	@NotBlank(message = "Email is required")
	@Column(name = "STUDENT_EMAIL")
	private String email;
	
	
	
	/*@Pattern(regexp = "[0-9]{3}-[0-9]{3}-[0-9]{4}")
	private String phone;
	*/
	
	@NotNull(message = "Department is required")
	@OneToOne
	@JoinColumn(name = "DEPT_ID")
	private Department department;
	
	/*
	 * @ManyToMany
	 * 
	 * @JoinTable( name = "PRODUCT_CUSTOMER", joinColumns =
	 * {@JoinColumn(name="PRODUCT_ID", referencedColumnName = "ID")},
	 * inverseJoinColumns = {@JoinColumn(name="CUSTOMER_ID", referencedColumnName =
	 * "ID")} ) private Customer customer;
	 */
	
	
}
