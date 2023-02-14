package sender;

import java.util.List;

public class SensorProcessor {

	public static void getTemperatureSensorData() {
		List<Integer> temperatureInFahrenheit = DataGenerator.generateRandomData(136);
		System.out.println(temperatureInFahrenheit);
	}

	public static void getSOCSensorData() {
		List<Integer> socData = DataGenerator.generateRandomData(100);
		System.out.println(socData);
	}
}
