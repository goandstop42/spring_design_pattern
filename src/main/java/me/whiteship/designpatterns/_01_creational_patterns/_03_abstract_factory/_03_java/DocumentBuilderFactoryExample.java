package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._03_java;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DocumentBuilderFactoryExample {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("src/main/resources/Book.xml"));
	        
	    Element root = document.getDocumentElement();
	     // root 요소 확인 : 첫 태그 sample
	     System.out.println(root.getNodeName()); 
	     // root 요소의 첫번째 노드는 #Text
	     Node firstNode = root.getFirstChild();
	     // 다음 노드는 customer
	     Node customer = firstNode.getNextSibling();
	     // customer 요소 안의 노드 리스트
	     NodeList childList = customer.getChildNodes();
        
        
        for(int i = 0; i < childList.getLength(); i++) {
        	Node item = childList.item(i);
        	if(item.getNodeType() == Node.ELEMENT_NODE) { // 노드의 타입이 Element일 경우(공백이 아닌 경우)
        		System.out.println(item.getNodeName());
        		System.out.println(item.getTextContent());
        	} else {
        		System.out.println("공백 입니다.");
        	}
        }
    }
}
