package com.user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.ShareParameters;

/**
 * Servlet implementation class Meeting_Creation
 */
@WebServlet("/Meeting_Creation")
public class Meeting_Creation extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;
	public static String Roomname;
	//public static String name;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Meeting_Creation()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String date=request.getParameter("date");
	String time=request.getParameter("time");
	System.out.println(time);
	String Discription=request.getParameter("Discription");
	Roomname=request.getParameter("Roomname");
	//name=Login.participant;
	ShareParameters sh=new ShareParameters();
	sh.Share(Roomname, Discription, date, time);
	System.out.println("sjhbsgh");
	Login.part1.add(Login.participant);
	response.sendRedirect("VideoConference.jsp");
	}

	
}
