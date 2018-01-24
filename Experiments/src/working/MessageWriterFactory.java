package working;

public class MessageWriterFactory {

	public static IMessageFormater createInstance(String type){
		
		if(type.equalsIgnoreCase("Html")){
			return new HtmlMessageWriter();
		}
		else if(type.equalsIgnoreCase("text")){
			return	new TextMessageWriter(); 
		}
		return null;
	}
}
