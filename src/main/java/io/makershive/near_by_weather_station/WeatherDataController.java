package io.makershive.near_by_weather_station;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.GeoResults;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weatherData")
public class WeatherDataController {
	
	@Autowired
	WeatherDataService weatherDataService;
	
	
	@RequestMapping(method=RequestMethod.POST)
	public WeatherData save(@RequestBody WeatherData weatherData) {
	return weatherDataService.saveWeather(weatherData);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<WeatherData> getAll() {
	return weatherDataService.getAll();
	}
	
	
    
	@RequestMapping(value="radius", method=RequestMethod.GET)
	public GeoResults<WeatherData> findByRadius(@RequestParam float lat,@RequestParam float lng,@RequestParam int radius){
		System.out.println(lat+" "+lng+" "+radius);
		return weatherDataService.getNearBy(lat, lng, radius);
	}

}
