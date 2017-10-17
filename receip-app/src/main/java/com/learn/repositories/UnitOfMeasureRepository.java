package com.learn.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.learn.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long>{
	Optional<UnitOfMeasure> findByDescription(String des);
}
