package info._7chapters.webservice.ch01.ws;

import java.util.Date;

import javax.jws.WebService;
/**
* The @WebService property endpointInterface links the
* SIB (this class) to the SEI (ch01.ts.TimeServer).
* Note that the method implementations are not annotated
* as @WebMethods.
*/
@WebService(endpointInterface = "info._7chapters.webservice.ch01.ws.TimeServer")
public class TimeServerImpl implements TimeServer {

	@Override
	public String getTimeAsString() {
		return new Date().toString();
	}

	@Override
	public long getTimeAsElapsed() {
		return new Date().getTime();
	}

}
