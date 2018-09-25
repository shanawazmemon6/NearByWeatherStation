package io.makershive.near_by_weather_station;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="weatherData")
public class WeatherData {

	@Id
	private long id;
	private String area;
	@GeoSpatialIndexed
	private double[] location;	
	
	public WeatherData() {
	}
	

    public WeatherData(long id,String area, double latitude, double longitude) {
    	this.id=id;
        this.area = area;
        this.location = new double[2];
        location[0] = latitude;
        location[1] = longitude;
    }

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public double[] getLocation() {
		return location;
	}
	public void setLocation(double[] location) {
		this.location = location;
	}
	
	 @Override
	    public String toString() {
	        return "Weather Station{" +
	                "id='" + id + '\'' +
	                ", area='" + area + '\'' +
	                ", location=" + Arrays.toString(location) 
	                +'}';
	    }
	
	
	
}
