package com.info.aggregator.model.openweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MainWeatherResponse {

    @JsonProperty("temp")
    private Long temperature;

    @JsonProperty("pressure")
    private Long pressure;

    @JsonProperty("humidity")
    private Long humidity;

    @JsonProperty("temp_min")
    private Long tempMin;

    @JsonProperty("temp_max")
    private Long tempMax;
}
