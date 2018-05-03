package com.info.aggregator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "WEATHER_CONDITIONS")
public class WeatherCondition extends AbstractEntity {

    @Column(name = "latitude")
    private Long latitude;

    @Column(name = "longitude")
    private Long longitude;

    @Column(name = "temp")
    private Long temp;

    @Column(name = "pressure")
    private Long pressure;

    @Column(name = "humidity")
    private Long humidity;

    @Column(name = "temp_min")
    private Long temp_min;

    @Column(name = "temp_max")
    private Long temp_max;

    @Column(name = "visibility")
    private Long visibility;

    @Column(name = "wind_speed")
    private Long wind_speed;

    @Column(name = "cloud_coverage")
    private Long cloud_coverage;

    @Column(name = "date")
    private Instant dateTime;

    @Column(name = "name")
    private String name;

}
