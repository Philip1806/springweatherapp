package com.example.weatherapp.api.model;

import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@ToString
public class WeatherRequest {
    private String place;
    private String country;
}
