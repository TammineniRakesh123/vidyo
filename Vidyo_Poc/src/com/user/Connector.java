package com.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Connector
 */
@WebServlet("/Connector")
public class Connector extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public static String Name;
       public static String RoomName;
       public static String tokenid;
       public static int count=1;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connector() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String date=request.getParameter("date");
		String time=request.getParameter("time");
		String Discription=request.getParameter("Discription");
		tokenid=request.getParameter("Token");
		Name=request.getParameter("Name");
		Login.part1.add(Name);
		RoomName=request.getParameter("Roomname");
		count++;
		response.sendRedirect("VideoConference.jsp");
}



}
