package com.munnur.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.munnur.DMS.Models.Dog;

/**
 * @author S550489 Munnur Karthik Kumar
 *
 */

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);
	

}
