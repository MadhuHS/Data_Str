package com.jspiders.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

import com.jspiders.models.User;

public class MySqlImpl implements Dao {

	private String url;
	private String dbname;
	private String dbusername;
	private String dbuserpwd;
	private Statement stmt;
	private PreparedStatement pms;
	private Connection con;

	private String insertUser = "insert into usersdb.instausers values(?,?,?,?,?,?,?,?)";
	private String getUser = "select email,pwd from usersdb.instausers where email = ?";
	private String delteUserbyemail = "delete from usersdb.instausers where email = ?";
	private String getUserProfile = "select * from usersdb.instausers where email = ?";
	private String getAllUserProfiles = "select * from usersdb.instausers";

	private HashMap<String,User> userTable = new HashMap<String,User>();
	
	
	public HashMap<String,User> getUserTable()
	{
		return userTable;
	}
	
	
	@Override
	public void initDB() throws SQLException,IOException
	{
		Properties dbProps = new Properties();
		
		String path = "/Users/Madhu/Documents/DataStructures/Data_Str/MysqlConfig.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		dbProps.load(fis);
		
		url = dbProps.getProperty("url","");
		dbname = dbProps.getProperty("dbname","");
		dbusername = dbProps.getProperty("dbusername","");
		dbuserpwd = dbProps.getProperty("dbuserpwd","");
		
	
		con = DriverManager.getConnection(url + dbname, dbusername, dbuserpwd);
		stmt = con.createStatement();
	}

	@Override
	public void closeDB() throws SQLException {
		con.close();
	}

	@Override
	public int insert(User us) throws SQLException {
		pms = con.prepareStatement(insertUser);
		pms.setInt(1, 0);
		pms.setString(2, us.getName());
		pms.setString(3, us.getEmail());
		pms.setString(4, us.getMob());
		pms.setString(5, us.getPwd());
		pms.setString(6, us.getDob());
		pms.setString(7, us.getGender());
		pms.setString(8, us.getBio());

		int count = pms.executeUpdate();

		return count;
	}

	@Override
	public int update(User us) throws SQLException {

		return 0;
	}

	@Override
	public int deleteByEmail(String email) throws SQLException {
		pms = con.prepareStatement(delteUserbyemail);
		pms.setNString(1, email);
		int count = pms.executeUpdate();
		return count;
	}

	@Override
	public int deleteByMob(String mob) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User getUserByEmail(String email) throws SQLException {
		pms = con.prepareStatement(getUser);
		pms.setString(1, email);

		ResultSet rs = pms.executeQuery();
		rs.next();

		String userEmail = rs.getString(1);
		String userPwd = rs.getString(2);

		User u1 = new User();
		u1.setEmail(userEmail);
		u1.setPwd(userPwd);

		return u1;
	}

	@Override
	public User getUserProfileByEmail(String email) throws SQLException {
		pms = con.prepareStatement(getUserProfile);
		pms.setString(1, email);

		ResultSet rs = pms.executeQuery();
		rs.next();

		User u1 = new User();
		u1.setName(rs.getString(2));
		u1.setEmail(rs.getString(3));
		u1.setMob(rs.getString(4));
		u1.setDob(rs.getString(6));
		u1.setGender(rs.getString(7));
		u1.setBio(rs.getString(8));

		return u1;
	}

	@Override
	public List<User> getAllUsers() throws SQLException {
		pms = con.prepareStatement(getAllUserProfiles);

		ResultSet rs = pms.executeQuery();

		List<User> userList = new LinkedList<User>();

		while (rs.next()) 
		{
			int columnIndex = 2;

			User u1 = new User();
			String name = rs.getString(columnIndex);

			u1.setName(name);
			columnIndex++;

			u1.setEmail(rs.getString(columnIndex++));
			u1.setMob(rs.getString(columnIndex++));
			u1.setPwd(rs.getString(columnIndex++));
			u1.setDob(rs.getString(columnIndex++));
			u1.setGender(rs.getString(columnIndex++));
			u1.setBio(rs.getString(columnIndex++));

			userList.add(u1);
			
			userTable.put(rs.getString("email"), u1);

		}

		return userList;

	}

	@Override
	public Set<User> getAllUsersSortByEmail() throws SQLException {
		pms = con.prepareStatement(getAllUserProfiles);

		ResultSet rs = pms.executeQuery();
		
		Set<User> userSet = new TreeSet<User>();

		while (rs.next()) 
		{
			int columnIndex = 2;

			User u1 = new User();
			String name = rs.getString(columnIndex);

			u1.setName(name);
			columnIndex++;

			u1.setEmail(rs.getString(columnIndex++));
			u1.setMob(rs.getString(columnIndex++));
			u1.setPwd(rs.getString(columnIndex++));
			u1.setDob(rs.getString(columnIndex++));
			u1.setGender(rs.getString(columnIndex++));
			u1.setBio(rs.getString(columnIndex++));

			userSet.add(u1);

		}

		return userSet;
	}

}
