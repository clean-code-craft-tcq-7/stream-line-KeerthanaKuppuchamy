package sensor;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import sender.DataGenerator;

public class DataGeneratorTest {

	@Test
	public void testDataGenerator() {
		List<Integer> readingList = DataGenerator.generateRandomData(50);
		assertEquals(50, readingList.size());
	}

}
