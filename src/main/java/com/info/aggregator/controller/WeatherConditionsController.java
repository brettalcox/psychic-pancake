package com.info.aggregator.controller;

import com.info.aggregator.entity.WeatherCondition;
import com.info.aggregator.model.openweather.WeatherConditionDTO;
import com.info.aggregator.service.WeatherConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "${root.path}/weatherconditions")
@RestController
public class WeatherConditionsController {

    @Autowired
    private WeatherConditionService weatherConditionService;

    @GetMapping
    public List<WeatherCondition> searchWeatherConditions() {
        return weatherConditionService.searchWeatherConditions();
    }
}
