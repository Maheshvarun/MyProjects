package onExperiments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;

public class StAxParcer {

	public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLEventReader reader = factory.createXMLEventReader(new FileInputStream("D:\\New_03_15\\Experiments\\resource\\students.xml"));
		
		while(reader.hasNext()){
			XMLEvent event = reader.nextEvent(); 
			switch(event.getEventType()){
				case XMLStreamConstants.START_ELEMENT : 
			}
		}
	}
}
