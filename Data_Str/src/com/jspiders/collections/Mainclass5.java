package com.jspiders.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Mainclass5 
{
	public static void main(String[] args) 
	{
       TreeSet<String> ts = new TreeSet<String>();//Comparable
       
       String s1 = new String("a");
       String s2 = new String("d");
       String s3 = new String("c");
       String s4 = new String("b");
       String s5 = new String("c");
       
       ts.add(s1);//--> compareTo()
       ts.add(s2);
       ts.add(s3);
       ts.add(s4);
       ts.add(s5);
       
       ts.forEach(str -> System.out.println(str));
       
       System.out.println("-------------------------------------");
       
       Comparator<String> cmp = (String str1,String str2)->
    		                    {
    	                            int res = str2.compareTo(str1);
    	                            return res;
    		                    };
	                    
       TreeSet<String> ts2 = new TreeSet<String>(cmp);//Comparator
       ts2.add(s1);//compare()
       ts2.add(s2);
       ts2.add(s3);
       ts2.add(s4);
       ts2.add(s5);
       
       ts2.forEach(str -> System.out.println(str));
       
       System.out.println("-----------------------");
       
       
       Comparator<String> cmp2 = (String str1,String str2)->
                                {
    	                           if( str1.length() < str2.length())
    	                           {
    	                        	   return 1;
    	                           }
    	                           else if(str1.length() > str2.length())
    	                           {
    	                        	   return -1;
    	                           }
    	                           else
    	                           {
    	                        	   return 0;
    	                           }
                                };
       
       TreeSet<String> ts3 = new TreeSet<String>(cmp2);
       
       String st1 = new String("ee");
       String st2 = new String("aaaa");
       String st3 = new String("cccccc");
       String st4 = new String("bbbbbbbb");
       String st5 = new String("d");

       
       ts3.add(st1);
       ts3.add(st2);
       ts3.add(st3);
       ts3.add(st4);
       ts3.add(st5);
       
       ts3.forEach(str -> System.out.println(str));
       
       
      System.out.println("-----------------------");
      
      Comparator<StringBuffer> cmp3 = (StringBuffer sbr1,StringBuffer sbr2)->
                                     {
    	                                String str1 = sbr1.toString();
    	                                String str2 = sbr2.toString();
    	                                
    	                               int res = str1.compareTo(str2);
    	                               return res;
                                     };

      TreeSet<StringBuffer> ts4 = new TreeSet<StringBuffer>(cmp3);
       
       StringBuffer sb1 = new StringBuffer("e");
       StringBuffer sb2 = new StringBuffer("a");
       StringBuffer sb3 = new StringBuffer("c");
       StringBuffer sb4 = new StringBuffer("b");
       StringBuffer sb5 = new StringBuffer("d");

       
       ts4.add(sb1);
       ts4.add(sb2);
       ts4.add(sb3);
       ts4.add(sb4);
       ts4.add(sb5);
       
       ts4.forEach(str -> System.out.println(str));
	}
}



