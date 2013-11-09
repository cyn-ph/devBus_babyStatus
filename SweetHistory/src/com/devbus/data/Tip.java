package com.devbus.data;

public class Tip {

	private String title;
	private String description;
	private String advice;

	public Tip(String title, String description, String advice) {
		super();
		this.title = title;
		this.description = description;
		this.advice = advice;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAdvice() {
		return advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

}
