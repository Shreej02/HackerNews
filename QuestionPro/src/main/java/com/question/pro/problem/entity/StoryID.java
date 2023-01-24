package com.question.pro.problem.entity;

public class StoryID {

	public Integer id;
	public StoryID() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public StoryID(Integer id) {
		super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "SpecificData [id=" + id + "]";
	}

}
