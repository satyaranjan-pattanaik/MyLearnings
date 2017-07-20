package designPattern.singleton;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

public class EnumExample {
	public static void main(String[] args) {
		
	//  Creation of HashMap
        HashMap<String, String> Geeks = new HashMap<>();
 
        //  Adding values to HashMap as ("keys", "values")
        Geeks.put("Language", "Java");
        Geeks.put("Platform", "Geeks For geeks");
        Geeks.put("Code", "HashMap");
        Set<Map.Entry<String, String>> mappingGeeks = Geeks.entrySet();
        System.out.println("Set of Keys and Values : "+mappingGeeks);
        Iterator<Entry<String, String>> iterator = Geeks.entrySet().iterator(); 
        
        while(iterator.hasNext()){
        	Map.Entry<String, String> entry = iterator.next();
        	iterator.remove(); // right way to remove entries from Map,
            // avoids ConcurrentModificationException
        	System.out.println("Set of Keys and Values : "+mappingGeeks);
        }
        
		for(Map.Entry<String, String> entryMap : Geeks.entrySet()){
			if(entryMap.getKey().equals("Platform")){
				System.out.println(entryMap.getKey());
				Geeks.remove(entryMap.getKey());
			}
		}
		
		
		
		
		
		EnumSet<Comp> enumSet = EnumSet.allOf(Comp.class);
		EnumSet<Comp> complementOf = enumSet.complementOf(enumSet.range(Comp.LEARN,Comp.QUIZ));
		System.out.println(enumSet);
		System.out.println(complementOf);
		for (Enum<Comp> enum1 : enumSet) {
			System.out.println(enum1.name());
			if(StringUtils.equals(enum1.name(), "CONTRIBUTE")){
				System.out.println("Excellent");
			}
		}
	}

	
	
}


enum Comp{
	 CODE, LEARN, CONTRIBUTE, QUIZ, MCQ
};