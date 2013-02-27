package info._7chapters.springws.ch01.jaxws;

import info._7chapters.webservice.ch02.ts.ws.TimeServer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TimeServiceClient {
	public static void main(String[] args) {
    	ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("info/_7chapters/springws/ch01/jaxws/applicationContext.xml");
    	TimeServer server = (TimeServer)ctx.getBean("myWebService");
       	System.out.println("TimeServiceClient.main()" + server.getTimeAsElapsed());
       	System.out.println("TimeServiceClient.main()" + server.getTimeAsString());
	}
}
