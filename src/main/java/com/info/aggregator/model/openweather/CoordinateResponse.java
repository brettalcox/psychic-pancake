package com.info.aggregator.model.openweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoordinateResponse {

    @JsonProperty("lon")
    private Long longitude;

    @JsonProperty("lat")
    private Long latitude;
}
