package com.info.aggregator.translator;

import com.info.aggregator.entity.WeatherCondition;
import com.info.aggregator.model.openweather.WeatherConditionDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WeatherConditionTranslator {

    public List<WeatherConditionDTO> translate(List<WeatherCondition> weatherConditions) {
        return null;
    }

}
