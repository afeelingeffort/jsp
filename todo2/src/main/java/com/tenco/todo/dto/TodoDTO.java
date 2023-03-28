package com.tenco.todo.dto;

public class TodoDTO {
	private int id;
	private String title;
	private String description;
	private int priority;
	private boolean completed; // 0 : false, 1 : true
	private String createdAt;
	private int category_id;

	public TodoDTO() {
	}
	
	public TodoDTO(int id, String title, String description, int priority, boolean completed, String createdAt,
			int category_id) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.completed = completed;
		this.createdAt = createdAt;
		this.category_id = category_id;
	}

	@Override
	public String toString() {
		return "TodoDTO [id=" + id + ", title=" + title + ", description=" + description + ", priority=" + priority
				+ ", completed=" + completed + ", createdAt=" + createdAt + ", category_id=" + category_id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

}
