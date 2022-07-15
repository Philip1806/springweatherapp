package com.example.weatherapp.data.ext.services;

import com.example.weatherapp.data.db.entity.forecast.Forecast;
import com.example.weatherapp.data.ext.restTemplate.interfaces.RestTemplateProvider;
import com.example.weatherapp.data.ext.services.interfaces.ForecastService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Primary
public class ForecastServiceImpl implements ForecastService {
    private final RestTemplateProvider restTemplateProvider;

    public ForecastServiceImpl(RestTemplateProvider restTemplateProvider) {
        this.restTemplateProvider = restTemplateProvider;
    }

    @Override
    public Forecast getForecast(Double lon, Double lat) {
        final String key = "1f34ee0b974a4cf3a5f93813220807";

        final String uri = "http://api.weatherapi.com/v1/current.json?key=" + key + "&q=" + lat
                + "," + lon;

        RestTemplate restTemplate=restTemplateProvider.getTemplate();
        return restTemplate.getForObject(uri, Forecast.class);
    }
}

