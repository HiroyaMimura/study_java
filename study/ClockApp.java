package study;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

import jana.util.*;

public class ClockApp extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		response.getWriter().println(new Date().toString());
	}
}
