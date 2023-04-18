package demo.naukri;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class Mapdata {
	
	@Test
	public void CollectionsTest() {
		Map<String, Integer>mp = new HashMap<String, Integer>();
		mp.put("Selenium",10);
		mp.put("Grid",11);
		mp.put("WebDriver",12);
		mp.put("WindowHandles",13);
		
		for (Map.Entry entry : mp.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		
	}
	

}
