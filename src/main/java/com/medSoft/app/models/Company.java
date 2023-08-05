package com.medSoft.app.models;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "companyDetails")
@Audited
public class Company {
	private static final long serialVersionUID = 1L;

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@GenericGenerator(name = "IntegerIdGenerator", strategy = "com.medSoft.util.IdGenerator")
	@GeneratedValue(generator = "IntegerIdGenerator")
	@Column(name="companyId")
	private int id;
	
	@Column(name="companyName")
	private String name;
	
	@Embedded
	private Address address;
	
	@Column
	private String gstNumber;
	
	@Column
	private String telephoneNumber;
	
	@Column
	private String mobileNumber;

	@Column
	private String panNumber;

	@Column
	private String ownerName;
	
	@Column
	private String ownerContactInfo;
	
	@Column
	private String ownerPanNumber;
	
	@Column
	private boolean enabled;
	
	@Column
	private String director1;
	
	@Column
	private String director2;
	
	@Email
	@Column
	private String director1Email;
	
	@Email
	@Column
	private String director2Email;
	
	@Embedded
	private AdditionalInfo additionalInfo;
	
	@Embedded
	private Base base;
	
}
