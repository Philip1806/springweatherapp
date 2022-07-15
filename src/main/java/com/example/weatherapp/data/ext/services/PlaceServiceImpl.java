package com.example.weatherapp.data.ext.services;

import com.example.weatherapp.api.models.WeatherRequest;
import com.example.weatherapp.api.models.WeatherResponse;
import com.example.weatherapp.data.db.entities.Country;
import com.example.weatherapp.data.db.entities.Place;
import com.example.weatherapp.data.db.entities.forecast.Forecast;
import com.example.weatherapp.data.db.repositories.CountryRepository;
import com.example.weatherapp.data.db.repositories.PlaceRepository;
import com.example.weatherapp.data.ext.services.interfaces.ForecastService;
import com.example.weatherapp.data.ext.services.interfaces.PlaceService;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@Primary
public class PlaceServiceImpl implements PlaceService {
    private final PlaceRepository placeRepository;
    private final CountryRepository countryRepository;
    private final ForecastService forecastService;

    public PlaceServiceImpl(PlaceRepository placeRepository, CountryRepository countryRepository, ForecastService forecastService) {
        this.placeRepository = placeRepository;
        this.countryRepository = countryRepository;
        this.forecastService = forecastService;
    }

    @Override
    public WeatherResponse getWeatherByLocation(WeatherRequest weatherRequest) {

        if(weatherRequest.getPlace().equals("") || weatherRequest.getCountry().equals("")){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        Country country=countryRepository.getCountryByCountryName(weatherRequest.getCountry());
        if(country==null)
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);

        Place place=placeRepository.getPlaceByCountryAndPlaceName(country, weatherRequest.getPlace());
        if(place==null)
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        System.out.println("COUNTRY ------->"+country);
        System.out.println("PLACE ----->" + place);
        Forecast forecast= forecastService.getForecast(place.getLon(),place.getLat());
        return WeatherResponse.builder()
                .placeName(place.getPlaceName())
                .typeName(place.getType().getTypeName())
                .temp(String.valueOf(forecast.getCurrent().getTemp_c()))
                .condition(forecast.getCurrent().getCondition().getText())
                .build();
    }
}
