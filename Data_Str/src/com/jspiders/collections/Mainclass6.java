package com.jspiders.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Mainclass6 
{
	public static void main(String[] args) 
	{
       PriorityQueue<String> pq = new PriorityQueue<String>();//Comparable
       
       String s1 = new String("a");
       String s2 = new String("d");
       String s3 = new String("c");
       String s4 = new String("b");
       String s5 = new String("c");
       
       pq.add(s1);//--> compareTo()
       pq.add(s2);
       pq.add(s3);
       pq.add(s4);
       pq.add(s5);
       
       System.out.println("size : "+pq.size());
      
       while(pq.isEmpty()!=true)
       {
    	 System.out.println(pq.poll());  
       }
       
       System.out.println("size : "+pq.size());

       
       System.out.println("-------------------------------------");
       
       Comparator<String> cmp = (String str1,String str2)->
    		                    {
    	                            int res = str2.compareTo(str1);
    	                            return res;
    		                    };
	                    
       PriorityQueue<String> pq2 = new PriorityQueue<String>(cmp);//Comparator
       pq2.add(s1);//compare()
       pq2.add(s2);
       pq2.add(s3);
       pq2.add(s4);
       pq2.add(s5);
       
       pq2.forEach(str -> System.out.println(str));
       
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
       
       PriorityQueue<String> pq3 = new PriorityQueue<String>(cmp2);
       
       String st1 = new String("ee");
       String st2 = new String("aaaa");
       String st3 = new String("cccccc");
       String st4 = new String("bbbbbbbb");
       String st5 = new String("d");

       
       pq3.add(st1);
       pq3.add(st2);
       pq3.add(st3);
       pq3.add(st4);
       pq3.add(st5);
       
       pq3.forEach(str -> System.out.println(str));
       
       
      System.out.println("-----------------------");
      
      Comparator<StringBuffer> cmp3 = (StringBuffer sbr1,StringBuffer sbr2)->
                                     {
    	                                String str1 = sbr1.toString();
    	                                String str2 = sbr2.toString();
    	                                
    	                               int res = str1.compareTo(str2);
    	                               return res;
                                     };

      PriorityQueue<StringBuffer> pq4 = new PriorityQueue<StringBuffer>(cmp3);
       
       StringBuffer sb1 = new StringBuffer("e");
       StringBuffer sb2 = new StringBuffer("a");
       StringBuffer sb3 = new StringBuffer("c");
       StringBuffer sb4 = new StringBuffer("b");
       StringBuffer sb5 = new StringBuffer("d");

       
       pq4.add(sb1);
       pq4.add(sb2);
       pq4.add(sb3);
       pq4.add(sb4);
       pq4.add(sb5);
       
       pq4.forEach(str -> System.out.println(str));
	}
}



