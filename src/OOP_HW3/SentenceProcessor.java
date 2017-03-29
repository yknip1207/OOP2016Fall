package OOP_HW3;


import java.util.ArrayList;
import java.util.List;

public class SentenceProcessor {
	public static void main(String argv[]){
		System.out.println(removeDuplicatedWords("Hello Hello World I love love the World I lovelove the World"));
		System.out.println(removeDuplicatedWords("Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo"));
		System.out.println(removeDuplicatedWords("a a la a la carte A la La carte Carte A a la la"));
		System.out.println(replaceWord("major", "minor", "The major problem is how to sing in A major"));
		System.out.println(replaceWord("on", "off", "Turn on the television I want to keep the television on"));
		System.out.println(replaceWord("love", "hate", "I love the World I lovelove the Love"));
		
	}
	/***
	 * 
	 * @param sentence
	 * @return
	 * 1. Turn sentence string into string[]
	 * 2. new a string list called resultList is used to store words that first occur in the sentence
	 * 3. Turn resultList into resultAry by toArray()
	 * 4, Join elements in resultAry by " "
	 */
	public static String removeDuplicatedWords(String sentence){
		List<String> resultList = new ArrayList<String>();
		String[] sentenceAry = sentence.split(" ");
		
		for(int i = 0; i <= sentenceAry.length - 1; i++){
			if(!resultList.contains(sentenceAry[i]))
				resultList.add(sentenceAry[i]);
		}
		String[] resultAry = new String[resultList.size()];
		resultAry = resultList.toArray(resultAry);
		return String.join(" ",resultAry);
		
	}
	
	public static String replaceWord(String target, String replacement, String sentence){
		String[] sentenceAry = sentence.split(" ");
		for(int i = 0; i <= sentenceAry.length - 1; i++){
			if(sentenceAry[i].equals(target))
				sentenceAry[i] = replacement;
		}	
		return String.join(" ", sentenceAry);
	}
}

