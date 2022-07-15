package com.example.weatherapp.api.models;

import lombok.*;
import org.springframework.stereotype.Service;

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
