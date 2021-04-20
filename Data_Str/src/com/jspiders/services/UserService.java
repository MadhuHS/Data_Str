package com.jspiders.services;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.jspiders.dao.MySqlImpl;
import com.jspiders.models.User;

public class UserService {

	private MySqlImpl ms = new MySqlImpl();
	
	public void login(String entEmail,String entPwd) throws SQLException, IOException
	{
	  /*Step1 : getUserByEmail(email) --> 
		Step2 : get email and pwd from the ResultSet
		Step3 : compare entEmil with email AND entPwd pwd
		Step4 : if->match-> login done
		          ->not match -> invalid email OR pwd
		*/
		
		ms.initDB();
		
		User u1  = ms.getUserByEmail(entEmail);
		
		String dbEmail = u1.getEmail();
		String dbpwd   = u1.getPwd();
		
		if(entEmail.equals(dbEmail) && entPwd.equals(dbpwd))
		{
			System.out.println("User Logged in");
		}
		else
		{
			System.out.println("Invalid Email or Password");
		}
		
		ms.closeDB();
	}
	
	public void signup(User us) throws SQLException, IOException
	{
		ms.initDB();
		
		int count = ms.insert(us);
		
		if(count > 0)
		{
			System.out.println("User Profile Created");
		}
		else
		{
			System.out.println("Error whil Creating User Profile");
		}
		
		ms.closeDB();
	}
	
	public void editProfile(User u1)
	{
	 //after update 
	}
	
	public void deleteProfile(String email) throws SQLException, IOException
	{
         ms.initDB();
		
        int count = ms.deleteByEmail(email);
		
		if(count > 0)
		{
			System.out.println("User Profile DELETED");
		}
		else
		{
			System.out.println("Error while deleting User Profile");
		}
		
		ms.closeDB();
	  
	}
	
	public void showProfile(String email)throws SQLException, IOException
	{
	    ms.initDB();
		
		User u1  = ms.getUserProfileByEmail(email);
		
		System.out.println(u1.toString());
		
		ms.closeDB();
	}
	
	public void showAllUsers() throws SQLException, IOException
	{
		ms.initDB();
		
		List<User> usersList = ms.getAllUsers();
		usersList.forEach(user -> System.out.println(user));
		
		//ms.getAllUsers().forEach(user -> System.out.println(user));
		
		ms.closeDB();
		
		
	}
	
	public void showAllUsersSortByEmail() throws SQLException, IOException
	{
		ms.initDB();
		
	    Set<User> userSet = ms.getAllUsersSortByEmail();
	    userSet.forEach(user -> System.out.println(user));
		
		//ms.getAllUsers().forEach(user -> System.out.println(user));
		
		ms.closeDB();
		
		
	}
	
	public void searchUser(String email) throws SQLException, IOException
	{
		HashMap<String, User>  userTable= ms.getUserTable();
		User u1 = userTable.get(email);
		if(u1!=null)
		{
	     System.out.println("User found");
		 System.out.println(u1);		 
		}
		else
		{
			 ms.initDB();
			 User u2  = ms.getUserProfileByEmail(email);
			 ms.closeDB();
			 if(u2!=null)
			 {
			 System.out.println("User found");
			 System.out.println(u2);
			 }
			 else
			 {
				 System.out.println("USer not found");
			 }
		}
	}
	
	
	
	public void logout() throws SQLException
	{
	  ms.closeDB();
	}
	
	
}





