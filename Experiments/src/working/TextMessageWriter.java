package working;

public class TextMessageWriter implements IMessageFormater{

	@Override
	public String messageWriter(String message) {
		return message+"! This is TextMessageWriter";
	}

}
