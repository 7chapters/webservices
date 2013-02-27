package info._7chapters.webservice.ch01.team.publisher;

import info._7chapters.webservice.ch01.team.ws.Teams;

import javax.xml.ws.Endpoint;

public class TeamsPublisher {
	public static void main(String[ ] args) {
		int port = 8888;
		String url = "http://localhost:" + port + "/teams";
		System.out.println("Publishing Teams on port " + port +" url = "+url);
		/**
		 * 	The Endpoint publisher has been single-threaded and, therefore,
		 *	capable of handling only one client request at a time:
		 */
		Endpoint.publish(url, new Teams());
		}
}