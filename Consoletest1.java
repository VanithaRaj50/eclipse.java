package collection_framework;

public class Consoletest {
	
public static void main(String args[]) {	
	Ramayana rayamana=new Ramayana();
	rayamana.authorName="Valmiki";	
	rayamana.price=8000.00;
	rayamana.name="NovelBook";
	Collection collection=new ArrayList();
	collection.add(rayamana);
	System.out.println(rayamana.name+ " "+rayamana.authorName+ " "+rayamana.price);	
	System.out.println(collection);	
}
}
