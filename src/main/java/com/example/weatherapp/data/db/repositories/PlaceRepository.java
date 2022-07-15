package com.example.weatherapp.data.db.repositories;

import com.example.weatherapp.data.db.entities.Country;
import com.example.weatherapp.data.db.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends JpaRepository<Place,Long> {
    Place getPlaceByCountryAndPlaceName(Country countryName, String placeName);
}
