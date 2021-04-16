package com.jspiders.models;

public class User extends Object implements Comparable<User>
{
	private int id;
	private String name;
	private String email;
	private String mob;
	private String pwd;
	private String dob;
	private String gender;
	private String bio;
	
	public User()
	{
		
	}
	
	public User(String name, String email, String mob, String pwd, String dob, String gender, String bio) {
		super();
		this.name = name;
		this.email = email;
		this.mob = mob;
		this.pwd = pwd;
		this.dob = dob;
		this.gender = gender;
		this.bio = bio;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
	
	@Override
	public int hashCode() 
	{
		return id;
	}

	@Override
	public String toString() {
		return this.name +" "+ this.email +" "+this.mob+ " "+this.dob+ " "
				+this.gender + " "+ this.bio;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		User u1 = (User)obj;
		
		String e1 = u1.getEmail();
		String e2 = this.email;
		
		boolean b1 = e1.equals(e2);
		
		return b1;
		
	}

	@Override
	public int compareTo(User usr) 
	{
        User u1 = (User)usr;
		
		String e1 = u1.getEmail();
		String e2 = this.email;	
		
		int res = e1.compareTo(e2);
		return res;
	}
	
}


