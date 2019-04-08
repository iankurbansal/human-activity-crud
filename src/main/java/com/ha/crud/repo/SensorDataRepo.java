package com.ha.crud.repo;

import org.springframework.data.repository.CrudRepository;

import com.ha.crud.entity.SensorData;

public interface SensorDataRepo extends CrudRepository<SensorData, Integer>{
}
