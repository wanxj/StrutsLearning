package charpter8.action;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction implements Action{
	private String username;
	private String password;
	
	private static Map<String,String> users = new HashMap<String, String>();

	public String execute() throws Exception {
		 ActionContext ctx = ActionContext.getContext();
		 Map application = ctx.getApplication();
		 Map session = ctx.getSession();
		 session.put("username", username);
		 Integer counter = (Integer) application.get("counter");
		 Integer counter2 = (Integer) session.get("counter2");
		 System.out.println(username);
		 if( !users.containsKey(username) ) {
			 ctx.put("info", "该用户不存在");
			 return ERROR;
		 } else if( password.equals(users.get(username))){
			 counter = (counter==null) ? 1 : (++counter);
			 counter2 = (counter2==null) ? 1 : counter2++;
			 application.put("counter", counter);
			 ctx.setApplication(application);
			 session.put("counter2", counter2);
			 ctx.put("info", "用户登录成功");
			 return SUCCESS;
		 } else {
			 ctx.put("info", "密码错误");
			 return ERROR;
			 
		 }
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	static {
		users.put("bill", "1234");
		users.put("mike", "1234");
	}
	
	public String register() throws Exception{
		return "register";
	}
}
