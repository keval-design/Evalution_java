package Assignment_map;

import java.util.Map;
import java.util.TreeMap;

public class StudentRecords {

	public static String findStudent(Map<String,String>map) {
		String longest = "";
		for(String name : map.values()) {
			longest = name;
		}
		return longest;
	}
	public static Map<String,String> sortStudent(Map<String,String>map){
		return new TreeMap<>(map);
	}
	public static<K,V> void printMap(Map<K,V>map) {
		for(Map.Entry<K,V>  entry : map.entrySet()) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}
	
}
