package com.example.weatherapp.api.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class WeatherResponse {
    private String placeName;
    private String typeName;
    private String temp;
    private String condition;
}
