package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="user_table",schema="berk")
public class User {
	
//	@GenericGenerator(
//	        name = "useridgenerator",
//	        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
//	        parameters = {
//	                @Parameter(name = "sequence_name", value = "USER_SEQ"),
//	                @Parameter(name = "initial_value", value = "1"),
//	                @Parameter(name = "increment_size", value = "1")
//	        }
//	)
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
@Column(updatable=false)
private Integer id;

//@Column(unique=true,updatable=true)
@NotEmpty
@Size(min=2 , max=30 , message="Name must be between 2-30 character")
private String isim;


public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getIsim() {
	return isim;
}

public void setIsim(String isim) {
	this.isim = isim;
}
}
