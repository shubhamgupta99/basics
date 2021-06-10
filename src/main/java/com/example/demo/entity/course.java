package com.example.demo.entity;

public class course {
	private long id;
	private String title;
	private String description;
	public course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getdescription() {
		return description;
	}
	public void setDesc(String description) {
		this.description = description;
	}
	public course(long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
}
