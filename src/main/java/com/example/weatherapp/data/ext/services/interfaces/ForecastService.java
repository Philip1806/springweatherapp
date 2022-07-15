package com.example.weatherapp.data.ext.services.interfaces;

import com.example.weatherapp.data.db.entity.forecast.Forecast;

public interface ForecastService {
    Forecast getForecast(Double lon, Double lat);


}
