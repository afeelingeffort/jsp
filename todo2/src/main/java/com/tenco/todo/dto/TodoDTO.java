package com.tenco.todo.dto;

public class TodoDTO {
	private int id;
	private String title;
	private String description;
	private int priority;
	private int completed; // 0 : false, 1 : true
	private String createdAt;
	private int categoryId;

	public TodoDTO() {
	}

	public TodoDTO(int id, String title, String description, int priority, int completed, String createdAt,
			int categoryId) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.completed = completed;
		this.createdAt = createdAt;
		this.categoryId = categoryId;
	}

	public TodoDTO(int id, String title, String description, int priority, int categoryId) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.categoryId = categoryId;
	}

	public TodoDTO(String title, String description, int priority, int categoryId) {
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "TodoDTO [id=" + id + ", title=" + title + ", description=" + description + ", priority=" + priority
				+ ", completed=" + completed + ", createdAt=" + createdAt + ", category_id=" + categoryId + "]";
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

	public int getCompleted() {
		return completed;
	}

	public void setCompleted(int completed) {
		this.completed = completed;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
