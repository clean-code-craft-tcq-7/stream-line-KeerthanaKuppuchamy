package sender;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGenerator {

	public static List<Integer> generateRandomData(Integer upperlimit) {
		Random random = new Random();
		List<Integer> readingList = new ArrayList<Integer>();
		for (int i = 0; i < Constants.MAX_NUMBER_OF_READINGS; i++) {
			readingList.add(random.nextInt(upperlimit));
		}
		return readingList;
	}
}
