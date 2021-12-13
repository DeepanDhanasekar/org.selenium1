package org.selenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class kjhh {
	public static void main(String[] args) {
		
	
	List li=new ArrayList();
	li.add("java");
	li.add(34);
li.add("456");
li.add("java");

System.out.println(li);

int si=li.size();
System.out.println(si);

li.remove(0);
li.remove(1);
System.out.println(li);
Set s=new HashSet();
s.addAll(li);
System.out.println(s);
System.out.println("neahs");
}
	
	
	

}
