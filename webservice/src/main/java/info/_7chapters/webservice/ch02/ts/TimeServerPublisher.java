package info._7chapters.webservice.ch02.ts;

import info._7chapters.webservice.ch02.ts.ws.TimeServerImpl;

import javax.xml.ws.Endpoint;

public class TimeServerPublisher {
	public static void main(String[ ] args) {
		Endpoint.publish("http://127.0.0.1:9876/ts_doc", new TimeServerImpl());
	}
}
