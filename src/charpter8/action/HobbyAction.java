package charpter8.action;

import com.opensymphony.xwork2.Action;

public class HobbyAction implements Action{
	String hobby;

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String execute() throws Exception {
		System.out.println("hello");
		return "success" ;
	}
	
	
}
