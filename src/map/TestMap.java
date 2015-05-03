package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map<String, String> testMap = new HashMap<String, String>();
		testMap.put("test", "ss");
		/*testMap.put("test1", "ss");
		testMap.put("test2", "ss");*/
		System.out.println(keyString(testMap, "ss"));
		
	} 
	public static Object keyString(Map<String, String> testMap,Object o)
	{
	          Iterator<String> it= testMap.keySet().iterator();
	          while(it.hasNext())
	          {
	              Object keyString=it.next();
	              if(testMap.get(keyString).equals(o))
	                   return keyString;
	           }
	           return null;
	}
}
