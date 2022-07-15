package com.example.weatherapp.api.controller;

import com.example.weatherapp.api.model.WeatherRequest;
import com.example.weatherapp.api.model.WeatherResponse;
import com.example.weatherapp.domain.interfaces.WeatherExecutor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    private final WeatherExecutor weatherExecutor;

    public WeatherController(WeatherExecutor weatherExecutor) {
        this.weatherExecutor = weatherExecutor;
    }

    @PostMapping("/weather/get")
    public WeatherResponse getWeather(@RequestBody WeatherRequest weatherRequest){
        return weatherExecutor.execute(weatherRequest);
    }
}
