package collection_framework;

public class RemoveNumericinString  {
	
	public static void main(String args[]) {
		
		String str="Ha49i HEl45lo";	
		
		str=str.replaceAll("[0-9]","");	
		
		System.out.println(str);
		
	}
	
}



