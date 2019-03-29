package com.user;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class TokenGenerator {

		public static ArrayList l=new ArrayList();
		public void TokenGenerator(String username,int time) 
		{
			l.clear();
			try 
			{
				String s=null;
				String exe="python C:\\Users\\ee210679\\Downloads\\generateToken.py --key=b138e831eb774015b97da32e8536de87 --appID=26fb2a.vidyo.io --userName="+username+" "+ "--expiresInSecs="+time;
				Process p=Runtime.getRuntime().exec(exe);
				BufferedReader in=new BufferedReader(new InputStreamReader(p.getInputStream()));
				while((s= in.readLine())!=null) {
					System.out.println(s);
					l.add(s);
				}
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
