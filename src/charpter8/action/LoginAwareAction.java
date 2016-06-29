package charpter8.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ServletRequestAware;

public class LoginAwareAction implements ServletRequestAware, ApplicationAware {

	private String username;
	private String password;
	private HttpServletRequest request;
	private Map application;
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	private static Map<String, String> users = new HashMap<String, String>();
	
	static {
		users.put("bill", "1234");
		users.put("mike", "1234");
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
	
	public String execute() {
		try {
			HttpSession session = request.getSession();
			Integer counter = (Integer) application.get("counter");
			session.setAttribute("username", username);
			String pw = users.get(username);
			if(pw == null) {
				request.setAttribute("info", "该用户不存在");
				return "error";
			} else {
				if(pw.equals(password)) {
					counter = (counter==null) ? 1 : (++counter);
					application.put("counter", counter);
					request.setAttribute("info", "已经登录成功");
					return "success";
				} else {
					request.setAttribute("info", "密码错误");
					return "error";
				}
			} 
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

}
