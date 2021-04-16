package com.jspiders.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Mainclass7 
{
	/*
	 * insert --> put(key, value)
	 * read   --> get(key)
	 * update --> put(key, newValue)
	 * delete --> remove(key)
	 */
	public static void main(String[] args) 
	{
        HashMap<String,Long> h1 = new HashMap<String,Long> ();
       
        h1.put("smith",9876541772l);
        System.out.println(h1.get("smith"));
        
        h1.put(null,100000000l);
        System.out.println(h1.get(null));
        
        h1.put("allen",9876541772l);
        System.out.println(h1.get("allen"));
        
        h1.put("smith",8888888888l);
        System.out.println(h1.get("smith"));
        
        h1.remove("smith");
        System.out.println(h1.get("smith"));
        
        
        System.out.println("-------------------------");
        
        TreeMap<String,Integer> h2 = new TreeMap<String,Integer>();
       
        h2.put("a",123);
        h2.put("d",234);
        h2.put("b",871);
        h2.put("c",951);
        
        Set<String> keys = h2.keySet();
        
        keys.forEach(key -> System.out.println(key+" --> "+h2.get(key)));
        
	}
}







