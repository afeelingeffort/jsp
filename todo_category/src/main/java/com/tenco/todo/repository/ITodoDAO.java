package com.tenco.todo.repository;

import java.util.ArrayList;

import com.tenco.todo.dto.CategoryDTO;
import com.tenco.todo.dto.TodoDTO;

public interface ITodoDAO {
	int insert(TodoDTO todoDTO);

	ArrayList<TodoDTO> select();

	int update(int id, TodoDTO todoDTO);

	int delete(int id);
	
	//카테고리 아이디와 투두 아이디와 카테고리 이름 뽑아내기
	ArrayList<CategoryDTO> selectCategoryIdAndTodoId(int categoryId, int id, String name);
}
