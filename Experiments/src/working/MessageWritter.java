package working;

public class MessageWritter {


		IMessageFormater iMessageFormater;

		public void writeMessage(String message){
			/*iMessageFormater  =  new HtmlMessageWriter();*/
			iMessageFormater = MessageWriterFactory.createInstance("text");
			String FormattedData = iMessageFormater.messageWriter(message);
			System.out.println(FormattedData);
		}



}
