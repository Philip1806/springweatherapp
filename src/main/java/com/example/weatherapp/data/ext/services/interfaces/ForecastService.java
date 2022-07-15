package com.example.weatherapp.data.ext.services.interfaces;

import com.example.weatherapp.data.db.entities.forecast.Forecast;

public interface ForecastService {
    Forecast getForecast(Double lon, Double lat);


}
