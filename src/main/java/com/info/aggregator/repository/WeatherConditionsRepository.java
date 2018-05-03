package com.info.aggregator.repository;

import com.info.aggregator.entity.WeatherCondition;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WeatherConditionsRepository extends CrudRepository<WeatherCondition, String> {
    List<WeatherCondition> findAll();
}
