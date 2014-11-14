package beans;

import java.util.Date;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloWorldMb {
	
	private String secondMessage;

	public String getMessage() {
		return "Hi, it's " + System.currentTimeMillis()
				+ " milliseconds since January 1 1970. Good to see you!";
	}
	

	public String getSecondMessage() {
		return secondMessage = new Date().toString();
	}
	public void setSecondMessage(String secondMessage) {
		this.secondMessage = secondMessage;
	}
	
	
	

}
