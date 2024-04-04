package com.telegram.maxym.telbot.entity.weather;

import lombok.Data;

@Data
public class CurrentWeather {
    private Double temp_c;
    private Condition condition;
    private Double wind_kph;
    private Double pressure_mb;
    private Double precip_mm;
    private Double humidity;
    private Double cloud;
    private Double feelslike_c;
}
