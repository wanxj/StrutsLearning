package charpter10.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import charpter10.model.UserBean;

public class Register extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String passwd = request.getParameter("passwd"); 
		String name = request.getParameter("name");
		String ageStr = request.getParameter("age");
		String birthdayStr = request.getParameter("birthday");
		int age = Integer.parseInt(ageStr);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		try {
		    Date birthday = format.parse(birthdayStr);
		    UserBean user = new UserBean();
		    user.setAge(age);
		    user.setBirthday(birthday);
		    user.setName(name);
		    user.setPasswd(passwd);
		    
		    String html= "";
		    html+="<h2>输出UserBean的属性值</h2>";
		    html+="<b>";
		    html+="<p>age:</p>" + user.getAge();
		    html +="birthday" + user.getBirthday();
		    html+="name" + user.getName();
		    out.println(html);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
