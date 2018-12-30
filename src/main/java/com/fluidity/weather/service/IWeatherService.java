package com.fluidity.weather.service;


public interface IWeatherService<T>{

    public T getForecast(String city) throws Exception;

}
