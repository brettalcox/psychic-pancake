package com.info.aggregator.model.openweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WindResponse {

    @JsonProperty("speed")
    private Long speed;

    @JsonProperty("deg")
    private Long degree;


}
