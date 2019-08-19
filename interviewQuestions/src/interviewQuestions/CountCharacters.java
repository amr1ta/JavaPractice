/**
 * 
 */
package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Amrita
 *
 */
public class CountCharacters {

	public static Map<Character,Integer> getCharFreq(String s) {
		  Map<Character,Integer> charFreq = new HashMap<Character,Integer>();
		  if (s != null) {
		    for (Character c : s.toCharArray()) {
		      Integer count = charFreq.get(c);
		      int newCount = (count==null ? 1 : count+1);
		      charFreq.put(c, newCount);
		    }
		  }
		  return charFreq;
		}

	
	public static void main(String[] args) {
		Map counts= getCharFreq("amardeep");
		/*System.out.println(counts.get('a'));
		System.out.println(counts.get('m'));
		System.out.println(counts.get('r'));
		System.out.println(counts.get('t')); */
		System.out.println(counts);
		
	}

}
