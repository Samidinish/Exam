package students.data.processing;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.bind.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class ProcessStudentInfo {

		/*
		 * Under XmlReader class, the parseData() will return list of Student Info which will contain Student first name, last name and score.
		 * You need to implement the method name "convertIntToChar()" which will convert String score into char Grade.('A'for 90 to 100,'B'for 80 to 89 and 
		 * 'C' for 70 to 79.
		 * 
		 * Here in the main method fill in the code that outlined to read xml data parsed into 2 separate ArrayList, then store into map. 
		 * Once map has all data, retrieve those data and out put to console.
		 *
		 * Do any necessary steps that require for below successful output.
		 * .................................................
		 * Student (id= 1) "Marc" "Carp"       Grade= B
		 * Student (id= 2) "Israt" "Khan"      Grade= A
		 * Student (id= 3) "Mohi" "Uddin"      Grade= A
		 * Student (id= 4) "Abrar" "Hossain"   Grade= B
		 * Student (id= 5) "Abida" "Sultana"   Grade= C
		 * .................................................
		 * 
		 * 
		 */
			public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
				//Path of XML data to be read.
				String pathSelenium  = System.getProperty("user.dir") +"/src/xml/reader/selenium.xml";
				String pathQtp = System.getProperty("user.dir") + "/src/xml/reader/qtp.xml";
				String tag = "id";
				
				//Declare a Map with List<String> into it.
				
				
				/*Declare 2 ArrayList with Student data type to store Selenium student into one of the ArrayList and
				  Qtp student into another ArrayList. */
				
				
				
				//Create XMLReader object.
				
				//Parse Data using parseData method and then store data into Selenium ArrayList.
				
				//Parse Data using parseData method and then store data into Qtp ArrayList.
				
				//add Selenium ArrayList data into map.
			
				//add Qtp ArrayList data into map.
		
		      	
				//Retrieve map data and display output.

                boolean bFirstName = false;
                boolean bLastName = false;
                boolean bNickName = false;
                boolean bMarks = false;
                try {
                    XMLInputFactory factory = XMLInputFactory.newInstance();
                    XMLEventReader eventReader =
                            factory.createXMLEventReader(
                                    new FileReader("input.txt"));

                    while(eventReader.hasNext()){
                        XMLEvent event = eventReader.nextEvent();
                        switch(event.getEventType()){
                            case XMLStreamConstants.START_ELEMENT:
                                StartElement startElement = event.asStartElement();
                                String qName = startElement.getName().getLocalPart();
                                if (qName.equalsIgnoreCase("student")) {
                                    System.out.println("Start Element : student");
                                    Iterator<Attribute> attributes = startElement.getAttributes();
                                    String rollNo = attributes.next().getValue();
                                    System.out.println("Roll No : " + rollNo);
                                } else if (qName.equalsIgnoreCase("firstname")) {
                                    bFirstName = true;
                                } else if (qName.equalsIgnoreCase("lastname")) {
                                    bLastName = true;
                                } else if (qName.equalsIgnoreCase("nickname")) {
                                    bNickName = true;
                                }
                                else if (qName.equalsIgnoreCase("marks")) {
                                    bMarks = true;
                                }
                                break;
                            case XMLStreamConstants.CHARACTERS:
                                Characters characters = event.asCharacters();
                                if(bFirstName){
                                    System.out.println("First Name: "
                                            + characters.getData());
                                    bFirstName = false;
                                }
                                if(bLastName){
                                    System.out.println("Last Name: "
                                            + characters.getData());
                                    bLastName = false;
                                }
                                if(bNickName){
                                    System.out.println("Nick Name: "
                                            + characters.getData());
                                    bNickName = false;
                                }
                                if(bMarks){
                                    System.out.println("Marks: "
                                            + characters.getData());
                                    bMarks = false;
                                }
                                break;
                            case  XMLStreamConstants.END_ELEMENT:
                                EndElement endElement = event.asEndElement();
                                if(endElement.getName().getLocalPart().equalsIgnoreCase("student")){
                                    System.out.println("End Element : student");
                                    System.out.println();
                                }
                                break;
                        }
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (XMLStreamException e) {
                    e.printStackTrace();
                }

				
			}

}
