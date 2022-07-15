package com.example.weatherapp.domain.interfaces;

import com.example.weatherapp.api.model.WeatherRequest;
import com.example.weatherapp.api.model.WeatherResponse;

public interface WeatherExecutor {
    WeatherResponse execute(WeatherRequest weatherRequest);
}
