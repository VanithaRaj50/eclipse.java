package collection_framework;

import java.util.Collection;
import java.util.*;


public class AssetContainer implements Asset {
	Collection collection=new ArrayList();
	LinkedList list=new LinkedList(); 
	
	@Override	
	public void addAsset(Object object) {
		System.out.println("Involked AddAsset");
		collection.add(object);			
		} 
	
	
	@Override	
	public boolean searchAsset(Object object) {	
		System.out.println("Involked searchAsset");		
		boolean result=collection.contains(object);	
		return result;			
		} 
	
	@Override
	public void updateAsset(Object object, String newName) {
		
		System.out.println("Involked updateAsset");		
		ArrayList container=(ArrayList)collection;
		
		int index=container.indexOf(object);	
		Object asset=container.get(index);	
		Book1 bookAsset=(Book1)asset;		
		bookAsset.setName(newName);	
		container.add(index, bookAsset);
		} 	
	
	@Override	
	public void deleteAsset(Object object) {
		System.out.println("Involked deleteAsset");	
		collection.remove(object);		
		} 
	
	
	@Override	
	public void listOfAllAssets() {
		System.out.println("Involked listAsset");
		System.out.println(collection);		
		}	
	
	@Override
	public void removeLastAsset() {
		System.out.println("Involked removeLastAsset");
		list.removeLast(); 		
		} 
	
	
	@Override	
	public void removeFirstAsset() {
		System.out.println("Involked removeFirstAsset");
		} 
	
	@Override
	public void getFirstAsset() {
		System.out.println("Involked getFirstAsset"); 
		} 
	
	@Override
	public void getLastAsset() {	
		System.out.println("Involked getLastAsset");
		} 
	
	@Override	
	public void addFirstAsset(Object object) {	
		System.out.println("Involked addFirstAsset");
		} 	
	
	@Override	
	public void addLastAsset(Object object) {	
		System.out.println("Involked addLastAsset");
	}
