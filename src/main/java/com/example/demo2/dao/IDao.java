package com.example.demo2.dao;

import java.util.List;

public interface IDao<T> {
	 void create(T o);

     void delete(T o);

     void update(T o);

    T findById(int id);

    List<T> findAll();
	
}
