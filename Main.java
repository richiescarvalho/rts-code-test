
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Richie Carvalho
 *
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Test Cases for Above and Below=");
		testAboveBelow();
		
		
		System.out.println("Test Cases for String Rotation=");
		testStringRotation();
    }

    private static void testStringRotation() {
		// TODO Auto-generated method stub
    	String result = stringRotation("TESTRTSMYSTRING", 5);
    	System.out.println("Result for String 'TESTRTSMYSTRING' with rotation length 5 = "+result);
    	
    	String resultMoreThanLength = stringRotation("TESTRTSMYSTRING", 20);
		
		System.out.println("Result for String 'TESTRTSMYSTRING' with rotation length 20. It is more than string length = "+resultMoreThanLength);
		
		String resultNull = stringRotation(null, 0);
		
		System.out.println("Result for String is NULL = " + resultNull);
		
		String resultEmptyString = stringRotation("", 20);
		
		System.out.println("Result for Empty String = "+resultEmptyString);
		
	}

	private static void testAboveBelow() {
		
        List<Integer> listWithSortedValue = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<String,Integer> results = aboveBelow(listWithSortedValue,5);

        System.out.println("Result for List where all value are sorted = "+results);
        
        List<Integer> listWithUnSortedValue = Arrays.asList(3, -7, 8, 4, 5, 1, -2, -6, 9, 10);
        Map<String,Integer> resultsUnSortedValue = aboveBelow(listWithUnSortedValue,2);
        
        System.out.println("Result for List where all value are unsorted and has negative values = "+resultsUnSortedValue);
        
        List<Integer> listNull = null;
        Map<String,Integer> resultsNull = aboveBelow(listNull,5);

        System.out.println("Result for List where list is null = "+resultsNull);
	}

	public static Map<String,Integer> aboveBelow(List<Integer> list, int value){

		Map<String, Integer> result = new HashMap<>();
		Integer countAbove = 0;
		Integer countBelow = 0;
		
		if(list == null) {
			result.put("above",countAbove);
	        result.put("below", countBelow);
	        return result;
		}
		
		/*
		 * 
		 * int collectAbove = (int) list.stream().filter(x -> x > value).count();
        int collectBelow = (int) list.stream().filter(x -> x < value).count();*/

		for(Integer num : list) {
			if(num < value) {
				countBelow++;
			} else if(num > value) {
				countAbove++;
			}
		}

		result.put("above",countAbove);
        result.put("below", countBelow);

        return result;
    }
	
	
	public static String stringRotation(String str, int numRotation) {
		if(str == null || str.isEmpty()) return str;
		
		int length = str.length();
		int  num= length - (numRotation%length);
		String result = str.substring(num) + str.substring(0, num);
		return result;
	}
}
