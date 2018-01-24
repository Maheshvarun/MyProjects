package working;

public class HtmlMessageWriter implements IMessageFormater{

	public String messageWriter(String message) {
		// TODO Auto-generated method stub
		return "<html><H3>"+message+"! This is HtmlMessageWriter</H3></html>";		
	}
}	
