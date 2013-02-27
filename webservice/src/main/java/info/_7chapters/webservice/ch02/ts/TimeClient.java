package info._7chapters.webservice.ch02.ts;

import info._7chapters.webservice.ch02.tsdoc.TimeServer;
import info._7chapters.webservice.ch02.tsdoc.TimeServerImplService;
class TimeClient {
	public static void main(String args[ ]) throws Exception {
		TimeServerImplService service = new TimeServerImplService();
		TimeServer eif = service.getTimeServerImplPort();
		System.out.println(eif.getTimeAsString());
		System.out.println(eif.getTimeAsElapsed());
	}
}