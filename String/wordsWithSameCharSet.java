// Java program to print all words that have
// the same unique character set
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.*;
public class GFG {


	
	// Print all words together with same character sets.
	static void wordsWithSameCharSet(String words[], int n)
	{
	    HashMap<HashSet<Character>, ArrayList<String>> bmap=new HashMap<>();
	    
	    for(String st: words){
	        
	        HashSet<Character> set=new HashSet<>();
	        
	        for(int i=0;i< st.length();i++){
                char ch=st.charAt(i);
                
                set.add(ch);
	        }
	        
	        if(!bmap.containsKey(set)){
	            ArrayList<String> list=new ArrayList<>();
	            list.add(st);
	            bmap.put(set,list);
	        }else{
	            ArrayList<String> list=bmap.get(set);
	            list.add(st);
	            bmap.put(set,list);
	        }
	   }
	   
	   for(ArrayList<String> val:bmap.values()){
	       for(String str: val){
	           System.out.print(str+",");
	       }
	       System.out.println();
	   }
	
	}
	
	// Driver program to test above function
	public static void main(String args[])
	{
		String words[] = { "may", "student", "students", "dog",
					"studentssess", "god", "cat", "act", "tab",
					"bat", "flow", "wolf", "lambs", "amy", "yam",
					"balms", "looped", "poodle"};
		int n = words.length;
		wordsWithSameCharSet(words, n);
	}
}


// student,students,studentssess,
// looped,poodle,
// may,amy,yam,
// tab,bat,
// cat,act,
// flow,wolf,
// dog,god,
// lambs,balms,
