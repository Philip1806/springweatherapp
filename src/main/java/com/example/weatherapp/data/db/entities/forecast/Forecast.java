package com.example.weatherapp.data.db.entities.forecast;

import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Forecast {
    private Location location;
    private Current current;
}
