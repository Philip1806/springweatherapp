package com.example.weatherapp.data.db.repository;

import com.example.weatherapp.data.db.entity.Country;
import com.example.weatherapp.data.db.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends JpaRepository<Place,Long> {
    Place getPlaceByCountryAndPlaceName(Country countryName, String placeName);
}
