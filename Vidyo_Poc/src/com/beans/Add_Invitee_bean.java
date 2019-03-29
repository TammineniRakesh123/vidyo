package com.beans;

import java.util.ArrayList;
import java.util.HashSet;

import com.user.Data_users;

public class Add_Invitee_bean {
	public static ArrayList participant=new ArrayList();

	public static void main(String participant) 
	{
		for(int i=0;i<Data_users.userdetails.size();i++)
		{
		if(participant.equals(Data_users.userdetails.get(i)))
		{
			Add_Invitee_bean.participant.add(participant);
		}
		}
		System.out.println(Add_Invitee_bean.participant);
	}

}
