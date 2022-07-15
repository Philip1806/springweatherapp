package com.example.weatherapp.domain.mapper;

import com.example.weatherapp.data.db.entity.forecast.Forecast;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Service;

@Service
public class WeatherMapper {
    public String getWeather(Forecast weather){
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();

        return gson.toJson(weather);
    }
}
