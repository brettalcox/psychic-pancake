package com.info.aggregator.client;

import com.info.aggregator.helper.UrlHelper;
import com.info.aggregator.model.openweather.OpenWeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OpenWeatherClient {

    @Value("${openweather.appid}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UrlHelper urlHelper;

    public OpenWeatherResponse getWeatherConditionByZipAndCountry(String zipCode, String countryCode) {
        ResponseEntity<OpenWeatherResponse> response = restTemplate.exchange(urlHelper.getOpenWeatherByZipAndCountryURI(zipCode, countryCode, apiKey), HttpMethod.GET, null, OpenWeatherResponse.class);
        return response.getBody();
    }


}
