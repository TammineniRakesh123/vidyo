package com.user;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.beans.Add_Invitee_bean;

/**
 * Servlet implementation class Add_Invitee
 */
@WebServlet("/Add_Invitee")
public class Add_Invitee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static boolean present; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add_Invitee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Data_users s=Data_users.main();
		s.user();
		String participant=request.getParameter("invitees");
		Add_Invitee_bean.main(participant);
		response.sendRedirect("Meeting.jsp");

	}


}
