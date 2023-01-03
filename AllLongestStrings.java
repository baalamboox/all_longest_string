/*
	Given an array of strings, return another array conteinning all of its longest strings
*/
import java.util.*;
public class AllLongestStrings {
	public static String[] inputArray = {"aba", "aa", "ad", "vcd", "aba", "guillermo", "123456789", "123456789", "123456789"};
	public static ArrayList <String> newArray = new ArrayList();
	public static String [] newArrayString;
	public static int mayorLength = 0;

	public static String [] allLongestStrings(String[] inputArray) {
		for(int i = 0; i < inputArray.length; i++) {           
			if(inputArray[i].length() >= mayorLength) { 
				mayorLength = inputArray[i].length();
			}
		}
		for(int i = 0; i < inputArray.length; i++) {
			if(inputArray[i].length() == mayorLength) {
				newArray.add(inputArray[i]);
			}
		}
		for (int i = 0; i < newArray.size(); i++) {
			newArrayString[i] = newArray.get(i);
		}
		return newArrayString;
	}
	public static void main(String[] args) {
		//ArrayList array = allLongestStrings(inputArray)
		//inputArray = allLongestStrings(inputArray);
		/*
		for(int i = 0; i < 2; i++) {
			System.out.println(allLongestStrings(inputArray).get(i));
		}
		*/
		//System.out.println(allLongestStrings(inputArray).size());

		for(int i = 0; i < allLongestStrings(inputArray).length; i++){
			System.out.println(allLongestStrings(inputArray)[i]);
		}

	}
}