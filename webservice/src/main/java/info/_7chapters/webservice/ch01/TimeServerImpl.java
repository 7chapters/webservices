package info._7chapters.webservice.ch01;

import info._7chapters.webservice.ch01.TimeServer;

import java.util.Date;

import javax.jws.WebService;
/**
* The @WebService property endpointInterface links the
* SIB (this class) to the SEI (ch01.ts.TimeServer).
* Note that the method implementations are not annotated
* as @WebMethods.
*/
@WebService(endpointInterface = "info._7chapters.webservice.ch01.TimeServer")
public class TimeServerImpl implements TimeServer {

	@Override
	public String getTimeAsString() {
		// TODO Auto-generated method stub
		return new Date().toString();
	}

	@Override
	public long getTimeAsElapsed() {
		// TODO Auto-generated method stub
		return new Date().getTime();
	}

}
