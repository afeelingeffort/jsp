package com.tenco.todo.repository;

import java.util.ArrayList;

import com.tenco.todo.dto.TodoDTO;

public interface ITodoDAO {
	int insert(String title, String description, int priority, int categoryId);

	ArrayList<TodoDTO> select();

	int update(int id, String title);

	int delete(int id);
}
