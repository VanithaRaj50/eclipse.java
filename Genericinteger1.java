package collection_framework;

import java.util.Arraylist;

import java.util.*;

public class Genericinteger {
	public static void main(String args[]) {
		ArrayList list=new ArrayList();		
		list.add(10); 	list.add("jk");// compilr time error,type mismatch.	
		list.add(123.34);// 'compile time 'add only integer values not floating point no.
		list.add(100);	
		list.add(10000);	
		int i=(Integer)list.get(0); 
		//Type cast is required ,if we doesnot mention generics type	
		System.out.println(" 0th element: " +i);	
		String s=(String)list.get(1);
		//Type cast is required ,if we doesnot mention generics type	
		System.out.println("1st element: "+s);	
		//	Iterator itr=list.iterator();	
		//while(itr.hasNext()) {		
		//System.out.println(itr.next());	
		
}
}
