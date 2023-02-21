package sender;

import java.util.List;

public class SensorProcessor {

	// Get Temperature sensor data
	public static void getTemperatureSensorData(IMessagePrinter messagePrinter) {
		List<Integer> temperatureInFahrenheit = DataGenerator.generateRandomData(Constants.MAX_TEMPERATURE_VALUE);
		messagePrinter.printMessageToConsole(temperatureInFahrenheit);
	}

	// Get SOC data
	public static void getSOCSensorData(IMessagePrinter messagePrinter) {
		List<Integer> socData = DataGenerator.generateRandomData(Constants.MAX_SOC_VALUE);
		messagePrinter.printMessageToConsole(socData);
	}
}
