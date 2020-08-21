package com.company.intersegrega.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.company.intersegrega.entity.Entity;

/**
 * A generic implemention of any type of object to persistce
 * @author alper
 *
 * @param <T>
 */
public class CommonPersistance<T extends Entity> implements PersistenceService<T>{

	private final Map<Long, T> data = new HashMap<>();
	
	
	@Override
	public void save(T entity) {
		synchronized (data) {
			data.put(entity.getId(), entity);
		}
		
	}

	@Override
	public void delete(T entity) {
		synchronized (data) {
			data.remove(entity.getId());
		}
	}

	@Override
	public T findById(Long id) {
		synchronized (data) {
			return data.get(id);
		}
	}
	
	/**
	 * Entity does not have name property
	 */
	@Override
	public List<T> findByName(String name) {
		throw new UnsupportedOperationException("Find by name is not supported.");
	}

}
