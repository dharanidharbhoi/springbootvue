package com.dharani.entity;


/**
 * this entity represent the topics
 * @author dbhoi
 *
 */
public class Topic {

	private int id;
	private String subject;
	private String description;
	
	
	public Topic() {
		
	}

	public Topic(int id, String subject, String description) {
			this.id = id;
		this.subject = subject;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
