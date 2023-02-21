package sensor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.List;

import org.junit.Test;

import sender.DataGenerator;

public class DataGeneratorTest {

	@Test
	public void testDataGenerator() {
		Integer max_value = 150;

		List<Integer> readingList = DataGenerator.generateRandomData(max_value);
		assertEquals(50, readingList.size());

		// Check value generated is less than given value
		assertTrue(Collections.max(readingList) < max_value);
	}

}
