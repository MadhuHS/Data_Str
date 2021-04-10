package com.jspiders.collections;

import java.util.ArrayList;

/* OPERATION         METHOD
 * no.of elements -> size()        --> common in all the Collections
 * insert         -> add(data)     --> common in all the Collections
 * search         -> contains(data)--> common in all the Collections
 ---------------------------------------------------------------
 * read           -> get(index)         -->common in all LIST type
 * update         -> add(index, newData)-->common in all LIST type
 * delete         -> remove(index)      -->common in all LIST type
 * */
public class Mainclass2 
{
	public static void main(String[] args) 
	{
        ArrayList a1 = new ArrayList();
   
        a1.add(10); //a1[0] = 10;
        a1.add(20);
        a1.add(null);
        a1.add(10);
        a1.add(30);
        a1.add(null);
        
        for(int index=0; index <= a1.size()-1; index++)
        {
          System.out.println(a1.get(index));
        }
        
       
        System.out.println("");
        
        a1.add(3, 50);//update
        System.out.println(a1.get(3));
        
        System.out.println("---DELETE index 1");
        a1.remove(1);//delete
        System.out.println(a1.get(1));
        
        boolean b1 = a1.contains(60);
        System.out.println(b1);
        
	}
}



