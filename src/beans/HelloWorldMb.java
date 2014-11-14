package beans;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloWorldMb {

	public String getMessage() {
		return "Hi, it's " + System.currentTimeMillis()
				+ " milliseconds since January 1 1970. Good to see you!";
	}

}
