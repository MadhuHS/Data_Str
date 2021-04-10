package com.jspiders.collections;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

/* OPERATION         METHOD
 * no.of elements -> size()        --> common in all the Collections
 * insert         -> add(data)     --> common in all the Collections
 * search         -> contains(data)--> common in all the Collections
 ---------------------------------------------------------------
 * read           -> get(index)         -->common in all LIST type
 * update         -> add(index, newData)-->common in all LIST type
 * delete         -> remove(index)      -->common in all LIST type
 * */
public class Mainclass3 
{
	public static void main(String[] args) 
	{
        ArrayList<Integer> a1 = new ArrayList<Integer>();
   
        a1.add(10); //a1[0] = 10;
        a1.add(23);
        a1.add(15);
        a1.add(10);
        a1.add(12);
        a1.add(30);
        
        Consumer<Integer> c1 = (Integer obj)->
                      {
                    	if(obj%2 == 0)
                    	{
        	            System.out.println(obj);
                    	}
                      };
        
        a1.forEach(c1);
        
        System.out.println("---------");
        
        a1.forEach( obj -> System.out.println(obj)); 
	}
}












