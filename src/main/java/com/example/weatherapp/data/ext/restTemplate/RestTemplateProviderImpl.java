package com.example.weatherapp.data.ext.restTemplate;

import com.example.weatherapp.data.ext.restTemplate.interfaces.RestTemplateProvider;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
@Primary
public class RestTemplateProviderImpl implements RestTemplateProvider {
    @Override
    public RestTemplate getTemplate() {
        return new RestTemplate();
    }
}
