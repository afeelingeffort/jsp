package com.tenco.todo.dto;

public class CategoryDTO extends TodoDTO {

	private int id;
	private String name;
	private int categoryId;

	public CategoryDTO(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public CategoryDTO(int categoryId, int id, String name) {
		super();
		this.categoryId = categoryId;
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "CategoryDTO [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
