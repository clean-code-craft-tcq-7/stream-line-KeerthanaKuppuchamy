package sensor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import sender.SensorProcessor;

public class SensorProcessorTest {

	@Test
	public void test() {
		FakeMessagePrinter fakeMessagePrinter = new FakeMessagePrinter();
		SensorProcessor.getTemperatureSensorData(fakeMessagePrinter);
		assertEquals(new Integer(1), fakeMessagePrinter.invocationCount);

		fakeMessagePrinter = new FakeMessagePrinter();
		SensorProcessor.getSOCSensorData(fakeMessagePrinter);
		SensorProcessor.getSOCSensorData(fakeMessagePrinter);
		assertEquals(new Integer(2), fakeMessagePrinter.invocationCount);
	}

}
