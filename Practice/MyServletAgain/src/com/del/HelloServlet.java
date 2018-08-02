package com.del;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.del.bean.User;
import com.del.bean.UserType;
import com.del.service.MyService;
import com.del.service.MyServiceImpl;

@WebServlet(urlPatterns = { "/greeting", "/register", "/viewusers","/checklogin", "/regdisplay" })
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MyService mService;

	public HelloServlet() {
		super();

	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
		mService = new MyServiceImpl();
	}

	public void destroy() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Do get...");
		String path = request.getServletPath();
		System.out.println("Path: " + path);

		switch (path) {
		case "/greeting":
			String name = request.getParameter("myname");
			String login = request.getParameter("mylogin");
			String password = request.getParameter("mypswd");
			User usr = new User(name, login, password);

			String type = mService.gettype(usr);
			usr.settype(type);
			request.setAttribute("user", usr);
			if (usr.gettype() == null) {
				request.getRequestDispatcher("fail.jsp").forward(request, response);
			} else if (type.equals("admin")) {
				request.getRequestDispatcher("admin.jsp").forward(request, response);
			}

			else {
				request.getRequestDispatcher("success.jsp").forward(request, response);
			}
			break;

		case "/register":
			String name2 = request.getParameter("name");
			String login2 = request.getParameter("login");
			String password2 = request.getParameter("password");
			String type2 = request.getParameter("type");
			User usr2 = new User(name2, login2, password2, type2);
			boolean res = mService.register(usr2);
			if (res == true)
				request.getRequestDispatcher("regsuccess.jsp").forward(request, response);
			else
				request.getRequestDispatcher("regfail.jsp").forward(request, response);
			break;
		case "/regdisplay":
			List<UserType> typeList = mService.getAllTypes();
			System.out.println(typeList);
			request.setAttribute("list1", typeList);
			request.getRequestDispatcher("register.jsp").forward(request, response);
			break;

		case "/viewusers":
			System.out.println("View All Users.");
			List<User> userList = mService.getAllUsers();
			request.setAttribute("list", userList);
			request.getRequestDispatcher("display.jsp").forward(request, response);
			break;

		case "/checklogin":
			System.out.println("check login exists");
			String loginExist = request.getParameter("loginval");
			System.out.println("login exist : " + loginExist);
			boolean loginExists = mService.checklogin(loginExist);
			System.out.println(loginExist);
			if(loginExists)
			response.getWriter().write("Username exists");
			else
				response.getWriter().write("Username can be used");
		default:
			break;
		}

		// response.setContentType("text/html");
		// PrintWriter out = response.getWriter();
		// out.println("<html>");
		// out.println("<head><title>Hello from servlet</title></head>");
		// out.println("<body>");
		// if(type == null) {
		// out.println("<h1>Hello " + name + ". Either login or password is
		// wrong</h1>");
		// }
		// else {
		// out.println("<h1>Hello " + name + ", Login success</h1>");
		// }
		// out.println("</html>");
		// out.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
