package com.info.aggregator.model.openweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenWeatherResponse {

    @JsonProperty("main")
    private MainWeatherResponse mainWeatherResponse;

    @JsonProperty("wind")
    private WindResponse windResponse;

    @JsonProperty("coord")
    private CoordinateResponse coordinateResponse;

    @JsonProperty("clouds")
    private CloudResponse cloudResponse;

    @JsonProperty("dt")
    private Long dateTime;

    @JsonProperty("visibility")
    private Long visibility;

    @JsonProperty("name")
    private String name;

}
