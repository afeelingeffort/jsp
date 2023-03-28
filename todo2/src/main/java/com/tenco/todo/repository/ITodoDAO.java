package com.tenco.todo.repository;

import java.util.ArrayList;

import com.tenco.todo.dto.TodoDTO;

public interface ITodoDAO {
	int insert(TodoDTO todoDTO);

	ArrayList<TodoDTO> select();

	int update(int id, TodoDTO todoDTO);

	int delete(int id);
}
