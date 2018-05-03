package com.info.aggregator.helper;

import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component

public class UrlHelper {
    private static final String URI = "http://api.openweathermap.org/data/2.5/weather?zip=64081,us&appid=5f608d24cc9c9cf95a1c90b2ba02eaff";

    public URI getOpenWeatherByZipAndCountryURI(String zipCode, String countryCode, String apiKey) {
        return UriComponentsBuilder.fromUriString(URI)
                .queryParam("zip", zipCode + "," + countryCode)
                .queryParam("appid", apiKey)
                .build().toUri();
    }

}
