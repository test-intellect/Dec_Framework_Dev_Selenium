package common;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapConcept {

	
	public static  void hashMapConcept() 
	{
		
		Map<String, String> hmap = new HashMap<String, String>();
		
		hmap.put("Name", "Bala");
		hmap.put("Age", "32");
		hmap.put("Mobile", null);
		hmap.put("Job", null);
		hmap.put(null, "Testingh");
		
		
	System.out.println(hmap.get("Job"));
	
	System.out.println(hmap.entrySet());
	System.out.println(hmap.keySet());
	
	System.out.println(hmap.size());
	hmap.clear();
	
	System.out.println(hmap.entrySet());
	
		
		
		
	}
	
	
	public static  void hashTableConcept() 
	{
		
		Map<String, String> hTable = new Hashtable<String, String>();
		
		hTable.put("Name", "Bala");
		hTable.put("Age", "32");
		hTable.put("Mobile", "946793469");
		hTable.put("Job", "Software");
		hTable.put("Occ", "Testingh");
		
		
	System.out.println(hTable.get("Job"));
	
	System.out.println(hTable.entrySet());
	System.out.println(hTable.keySet());
	
	System.out.println(hTable.size());
	hTable.clear();
	
	System.out.println(hTable.entrySet());
	
		
		
		
	}
	public static void main(String[] args) {
		
		
		
		//hashMapConcept();
		hashTableConcept();
	}
	
	
	
}
