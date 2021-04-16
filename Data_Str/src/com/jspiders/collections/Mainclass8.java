package com.jspiders.collections;

import java.util.ArrayList;

public class Mainclass8 {

	public static void main(String[] args) 
	{
       String[] a1 = new String[3];
       
       a1[0] = "aaaaa";
       a1[1] = new String("bb");
       a1[2] = "ccc";
       
       for (int i = 0; i < a1.length; i++) 
       {
		System.out.println(a1[i] + " " + a1[i].length());
	   }
       
       
       ArrayList<String> alist = new ArrayList<String>();
       
       alist.add("aaaaa");//add(Object obj)
       alist.add(new String("ccc"));
       alist.add("bb");
       alist.add(new String("ccc"));
       
       for (int i = 0; i < alist.size(); i++) 
       {	  
		  System.out.println(alist.get(i).length());
	   }
	}

}






