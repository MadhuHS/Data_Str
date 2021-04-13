package com.jspiders.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

import com.jspiders.models.User;

/* OPERATION         METHOD
 * no.of elements -> size()        --> common in all the Collections
 * insert         -> add(data)     --> common in all the Collections
 * search         -> contains(data)--> common in all the Collections
 ---------------------------------------------------------------
 * delete         -> remove(Object)      -->common in all SET type
 * 
 * */
public class Mainclass4 
{
	public static void main(String[] args) 
	{
        LinkedHashSet<Integer> hs1 = new LinkedHashSet<Integer>();
   
        hs1.add(10); 
        hs1.add(20);
        hs1.add(null);
        hs1.add(10);
        hs1.add(30);
        hs1.add(40);
        hs1.add(null);
        hs1.add(50);
      
        hs1.forEach(i1 -> System.out.println(i1));
        
        hs1.remove(30);
        
        System.out.println("------");
        
        hs1.forEach(i1 -> System.out.println(i1));
      
        
        HashSet<User> hs2 = new HashSet<User>();
        
        User u1 = new User();
        u1.setName("User1");
        u1.setEmail("user1@gmail.com");
        
        User u2 = new User();
        u2.setName("User2");
        u2.setEmail("user1@gmail.com");
        
        
        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());
        
        hs2.add(u1);
        hs2.add(u2);
        
        hs2.forEach(user->System.out.println(user));
        
        hs2.remove(u1);
        
        hs2.forEach(user->System.out.println(user));
        
        
	}
}















