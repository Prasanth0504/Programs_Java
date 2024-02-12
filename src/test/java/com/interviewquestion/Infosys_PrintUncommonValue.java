package com.interviewquestion;

import java.util.LinkedList;
import java.util.List;

public class Infosys_PrintUncommonValue {

	public static void main(String[] args) {
		String a[]={"Chennai","Mumbai","Delhi","Kolkatta"};

		String b[]={"Chennai","Goa","Delhi","Kolkatta"};
	
	
	List<String> list=new LinkedList<>();
	
	list.add("Chennai");
	list.add("Mumbai");
	list.add("Delhi");
	list.add("Kolkatta");
	
	
	List<String> list2=new LinkedList<>();
	
	list2.add("Chennai");
	list2.add("Goa");
	list2.add("Delhi");
	list2.add("Kolkatta");
	
	
	//list.removeAll(list2);
	
	list2.removeAll(list);
	System.out.println(list2);
	
	
	

	}

}
