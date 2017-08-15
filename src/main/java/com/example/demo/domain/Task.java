package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name="task_table",schema="berk")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @NotEmpty
	private String 	task_id;
    @NotEmpty
	private String title;
    @NotEmpty
	private String context;
	private String assignee;
	
	private Date create_date;
	
	private Date update_date;
	private String notes;
	
	
//	public Task() {
//		this.create_date=this.getCurrentDate();
//		this.update_date=this.getCurrentDate();
//	};
//	
//	public Task(String task_id,String title,String context,String assignee,String notes) {
//		this.task_id=task_id;
//		this.title=title;
//		this.context=context;
//		this.assignee=assignee;
//		this.create_date=this.getCurrentDate();
//		this.update_date=this.getCurrentDate();
//		this.notes=notes;
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTask_id() {
		return task_id;
	}

	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date() {
		this.create_date = this.getCurrentDate();
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date() {
		this.update_date = this.getCurrentDate();
	}

	public Date getCurrentDate() {

		Date date = new Date();
		return date;

	}
}
