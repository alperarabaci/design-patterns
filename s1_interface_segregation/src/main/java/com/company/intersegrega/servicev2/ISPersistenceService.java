package com.company.intersegrega.servicev2;

import java.util.List;

import com.company.intersegrega.entity.Entity;

//common interface to be implemented by all persistence services. 
public interface ISPersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);
	
	//interface segregatin says remove this method, Entity not include name
	//public List<T> findByName(String name);
}
