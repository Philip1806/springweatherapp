package com.example.weatherapp.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String getHome(){
        return "ok";
    }
    /*
    private final WeatherExecutor weatherExecutor;

    public HomeController(WeatherExecutor weatherExecutor) {
        this.weatherExecutor = weatherExecutor;
    }

    @PostMapping("/getWeather")
    public WeatherResponse getWeather(@RequestBody WeatherRequest weatherRequest){
        return weatherExecutor.execute(weatherRequest);
    }


     */
}
