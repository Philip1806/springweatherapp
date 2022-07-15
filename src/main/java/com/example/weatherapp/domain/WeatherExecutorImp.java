package com.example.weatherapp.domain;

import com.example.weatherapp.api.model.WeatherRequest;
import com.example.weatherapp.api.model.WeatherResponse;
import com.example.weatherapp.data.ext.services.interfaces.PlaceService;
import com.example.weatherapp.domain.interfaces.WeatherExecutor;
import org.springframework.stereotype.Service;

@Service
public class WeatherExecutorImp implements WeatherExecutor {
    private final PlaceService placeService;

    public WeatherExecutorImp(PlaceService placeService) {
        this.placeService = placeService;
    }

    @Override
    public WeatherResponse execute(WeatherRequest weatherRequest) {


        return placeService.getWeatherByLocation(weatherRequest);
    }
}
