package io.makershive.near_by_weather_station;

import org.springframework.data.geo.Distance;
import org.springframework.data.geo.GeoResults;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface WeatherDataRepository extends MongoRepository<WeatherData, Long>{
GeoResults<WeatherData> findByLocationNear(Point location,Distance distance);
}
