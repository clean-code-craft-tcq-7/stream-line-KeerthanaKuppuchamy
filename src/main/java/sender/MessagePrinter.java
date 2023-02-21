package sender;

import java.util.List;

public class MessagePrinter implements IMessagePrinter {

	public void printMessageToConsole(List<Integer> readings) {
		System.out.println(readings);
	}

}
