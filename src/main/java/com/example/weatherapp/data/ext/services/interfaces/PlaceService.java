package com.example.weatherapp.data.ext.services.interfaces;

import com.example.weatherapp.api.models.WeatherRequest;
import com.example.weatherapp.api.models.WeatherResponse;

public interface PlaceService {
WeatherResponse getWeatherByLocation(WeatherRequest weatherRequest);
}
