package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name="release_plan" ,schema="berk")
public class ReleasePlan {
	@Id
	@NotEmpty
	private String id;
	@NotEmpty
	private Timestamp relase_date;
	
	private String status;
	
	private String who;
	
	private Timestamp close_date;
	
	private Timestamp update_date;
	
	public void Release_Plan() {
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getRelase_date() {
		return relase_date;
	}

	public void setRelase_date(Timestamp relase_date) {
		this.relase_date = relase_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getWho() {
		return who;
	}

	public void setWho(String who) {
		this.who = who;
	}

	public Timestamp getClose_date() {
		return close_date;
	}

	public void setClose_date(Timestamp close_date) {
		this.close_date = close_date;
	}

	public Timestamp getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Timestamp update_date) {
		this.update_date = update_date;
	}
	
}
