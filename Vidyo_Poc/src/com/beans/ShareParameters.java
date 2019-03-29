package com.beans;

import java.util.Iterator;

import com.user.Login;
import com.user.Meeting_Creation;
import com.user.TokenGenerator;

public class ShareParameters
{
	String[] time;
	public static String name_users;
	public static String localtoken;
	public void Share(String roomname,String Discription,String date,String time)
	{
		ShareParameters sp=new ShareParameters();
		this.time=time.split(":");
		String localname=Login.participant;
		int t=Integer.parseInt(this.time[1]);
		System.out.println(localname+t);
	 localtoken=sp.TokenGen(roomname, localname, t*100);
	 System.out.println("gent");
		   for(int i=0;i<Add_Invitee_bean.participant.size();i++)
		   {
			   name_users=(String) Add_Invitee_bean.participant.get(i);
			   	 String token=sp.TokenGen(roomname, name_users, t*100);
			   	 System.out.println(token);
				 String share="http://10.1.17.66:8081/Vidyo_Poc/Connector?date="+date+"&time="+time+"&Discription="+Discription+"&Roomname="+roomname+"&Token="+token+"&Name="+name_users;
				 System.out.println(share);
		   }
	}
	public String TokenGen(String roomid,String username,int time)
	{
		TokenGenerator tg=new TokenGenerator();
		tg.TokenGenerator(username, time);
		return (String)tg.l.get(6);
	}
}
