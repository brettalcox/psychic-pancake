package com.info.aggregator.service;

import com.info.aggregator.entity.WeatherCondition;
import com.info.aggregator.model.openweather.WeatherConditionDTO;
import com.info.aggregator.repository.WeatherConditionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherConditionService {

    @Autowired
    private WeatherConditionsRepository weatherConditionsRepo;

    public List<WeatherCondition> searchWeatherConditions() {
        return weatherConditionsRepo.findAll();
    }

}
