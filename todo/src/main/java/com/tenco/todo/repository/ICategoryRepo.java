package com.tenco.todo.repository;

import java.util.ArrayList;

import com.tenco.todo.dto.CategoryDTO;

public interface ICategoryRepo {

	// CRUD
	// 매개변수는 WHERE절이나 그런 것들
	// ArrayList<CategoryDTO> -> ArrayList add!
	ArrayList<CategoryDTO> select();

	int insert(String name);

	int update(int id, String name);

	int delete(int id);

}
