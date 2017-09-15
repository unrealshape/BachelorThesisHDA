package main;

import Model.UserModel;
import Util.DatabaseManager;

public class testerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Validate Test for User");
		UserModel user = new UserModel();
		user.setUsername("fae");
		user.setPassword("maxpower123");
		
		DatabaseManager databaseManager = new DatabaseManager();
		try
		{
			databaseManager.getInstance().verbinden();
			if(databaseManager.getInstance().validateLoginUser(user))
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
			databaseManager.getInstance().getUser(user);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Username =>" + user.getUsername()
						+" Email => "+	user.getEmail()
						+" Firstname => "+ user.getFirstname()
						+" Lastname => "+ user.getLastname());

	}

}
