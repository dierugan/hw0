package uchidb;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

/**
 * @author aelmore
 */

class IntStrCont implements Containers<Integer, String> {

	private Map<String, Integer> map = null;

	public Set<Integer> initSet(Integer[] iArray) {
		return new HashSet<Integer>(Arrays.asList(iArray));
	}

	public List<Integer> initList(Integer[] iArray) {
		return Arrays.asList(iArray);
	}

	public Map<String,Integer> initEmptyMap() {
		return new HashMap<String, Integer>();
	}

	public void storeMap(Map<String,Integer> mapToStoreInClass) {
		map = mapToStoreInClass;
	}

	public boolean addToMap(String key, Integer value, boolean overwriteExistingKey) {
		if (map != null) {
			if (overwriteExistingKey || map.get(key) == null) {
				map.put(key, value);
				return true;
			}
		}
		return false; 
	}

	public Integer getValueFromMap(String key) {
		return map.get(key);
	}

	public Integer getValueFromMap(String key, Integer defaultValue) {
		if (map.get(key) == null) {
			return defaultValue;
		}
		return map.get(key);
	}
}

public class HW0Runner {

	//TODO you likely will need to add member variable
	private static Containers<Integer, String> containers = new IntStrCont(); 
	
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		// TODO fix this function
		return containers;
	}


	public static void main(String[] args){
		
	}
}
