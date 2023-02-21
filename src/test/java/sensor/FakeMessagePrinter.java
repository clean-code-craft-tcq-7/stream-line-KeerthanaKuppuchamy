package sensor;

import java.util.List;

import sender.IMessagePrinter;

public class FakeMessagePrinter implements IMessagePrinter {

	Integer invocationCount = 0;

	public void printMessageToConsole(List<Integer> readings) {
		invocationCount++;
	}

}
