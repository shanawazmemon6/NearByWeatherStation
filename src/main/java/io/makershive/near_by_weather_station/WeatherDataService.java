package io.makershive.near_by_weather_station;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.GeoResults;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Component;

@Component
public class WeatherDataService {
	

	@Autowired
	private WeatherDataRepository weatherDataRepository;
	
	public WeatherData saveWeather(WeatherData weatherData) {
		try {
			 weatherDataRepository.save(weatherData);
			 return weatherData;
		}
		catch (Exception e) {
			return new WeatherData();
		}
	}
	
	public List<WeatherData> getAll(){
		return weatherDataRepository.findAll();
	}
	
    public GeoResults<WeatherData> getNearBy(float lat,float lng,int radius){
		Point point=new Point(lng,lat);
		Distance distance=new Distance(radius,Metrics.KILOMETERS);
		GeoResults<WeatherData> data =weatherDataRepository.findByLocationNear(point,distance);
		return data;
		
	}

}
