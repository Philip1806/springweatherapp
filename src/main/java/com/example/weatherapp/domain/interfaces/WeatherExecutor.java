package com.example.weatherapp.domain.interfaces;

import com.example.weatherapp.api.models.WeatherRequest;
import com.example.weatherapp.api.models.WeatherResponse;

public interface WeatherExecutor {
    WeatherResponse execute(WeatherRequest weatherRequest);
}
