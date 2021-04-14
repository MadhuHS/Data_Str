package com.jspiders.collections;

import java.util.TreeSet;

public class Mainclass5 
{
	public static void main(String[] args) 
	{
       TreeSet<String> ts = new TreeSet<String>();
       
       String s1 = new String("a");
       String s2 = new String("d");
       String s3 = new String("c");
       String s4 = new String("b");
       String s5 = new String("c");
       
       ts.add(s1);
       ts.add(s2);
       ts.add(s3);
       ts.add(s4);
       ts.add(s5);
       
       ts.forEach(str -> System.out.println(str));
	}
}



