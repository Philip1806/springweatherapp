package com.example.weatherapp.data.ext.services.interfaces;

import com.example.weatherapp.api.model.WeatherRequest;
import com.example.weatherapp.api.model.WeatherResponse;

public interface PlaceService {
WeatherResponse getWeatherByLocation(WeatherRequest weatherRequest);
}
