package com.example.weatherapp.data.ext.restTemplate.interfaces;

import org.springframework.web.client.RestTemplate;

public interface RestTemplateProvider {
    RestTemplate getTemplate();
}
