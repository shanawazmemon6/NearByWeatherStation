package io.makershive.near_by_weather_station;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class NearByWeatherStation1Application implements CommandLineRunner {

	@Autowired
	WeatherDataRepository weatherDataRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(NearByWeatherStation1Application.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		weatherDataRepository.save(new WeatherData(1,"Film Nagar",78.4117,17.4142));
		weatherDataRepository.save(new WeatherData(2,"Panjagutta",78.4511, 17.4265));
		weatherDataRepository.save(new WeatherData(3,"Banjara Hills",78.4398, 17.4138));
		weatherDataRepository.save(new WeatherData(4,"Jubilee Hills",78.4070, 17.4325));
		weatherDataRepository.save(new WeatherData(5,"Dilsukhnagar",78.5247,17.3688));
		weatherDataRepository.save(new WeatherData(6,"L.B.NAGAR",78.5522,17.3457));
		weatherDataRepository.save(new WeatherData(7,"Chaitanyapuri",78.5371,17.3760));
		weatherDataRepository.save(new WeatherData(8,"Uppal",78.5583,17.3984));
		weatherDataRepository.save(new WeatherData(9,"Secunderabad",78.4983,17.4399));
		weatherDataRepository.save(new WeatherData(10,"Adilabad",79.5603,19.0809));
		weatherDataRepository.save(new WeatherData(11,"Pandharkaoda",78.5490,20.0230));
		weatherDataRepository.save(new WeatherData(12," Ghatanji",78.3117,20.1437));
		weatherDataRepository.save(new WeatherData(13,"Abids",78.4730,17.3930));
		weatherDataRepository.save(new WeatherData(14,"koti",78.4795,17.3858));
		weatherDataRepository.save(new WeatherData(15,"Basheerbagh", 78.4773,17.3991));
		weatherDataRepository.save(new WeatherData(16,"Gachibowli",78.3489, 17.4401));
		weatherDataRepository.save(new WeatherData(17,"Madhapur", 78.3915, 17.4483));
		weatherDataRepository.save(new WeatherData(18,"Hitec City", 78.3762, 17.4474));
		weatherDataRepository.save(new WeatherData(19,"Serilingampally",78.3158, 17.4837));
		weatherDataRepository.save(new WeatherData(20,"Begumpet", 78.4664, 17.4447));
		weatherDataRepository.save(new WeatherData(21,"Ameerpet",  78.4483, 17.4375));
		weatherDataRepository.save(new WeatherData(21,"Nacharam",  78.5598,17.4361));


	}
}
