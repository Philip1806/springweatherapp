package com.example.weatherapp.data.db.repository;

import com.example.weatherapp.data.db.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {
    Country getCountryByCountryName(String name);
}
