

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
		teststringRotation();
    }

	/**
	 * this is to test possible test cases for stringRotation method
	 */
    private static void teststringRotation() {
		// TODO Auto-generated method stub
    	String result = RtsTest.stringRotation("TESTRTSMYSTRING", 5);
    	System.out.println("Result for String 'TESTRTSMYSTRING' with rotation length 5 = "+result);
    	
    	String resultMoreThanLength = RtsTest.stringRotation("TESTRTSMYSTRING", 20);
		
		System.out.println("Result for String 'TESTRTSMYSTRING' with rotation length 20. It is more than string length = "+resultMoreThanLength);
		
		String resultNull = RtsTest.stringRotation(null, 0);
		
		System.out.println("Result for String is NULL = " + resultNull);
		
		String resultEmptyString = RtsTest.stringRotation("", 20);
		
		System.out.println("Result for Empty String = "+resultEmptyString);
		
	}

	/**
	 * this is to test possible test cases for aboveBelow method
	 */
	private static void testAboveBelow() {
		
        List<Integer> listWithSortedValue = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<String,Integer> results = RtsTest.aboveBelow(listWithSortedValue,5);

        System.out.println("Result for List where all value are sorted = "+results);
        
        List<Integer> listWithUnSortedValue = Arrays.asList(3, -7, 8, 4, 5, 1, -2, -6, 9, 10);
        Map<String,Integer> resultsUnSortedValue = RtsTest.aboveBelow(listWithUnSortedValue,2);
        
        System.out.println("Result for List where all value are unsorted and has negative values = "+resultsUnSortedValue);
        
        List<Integer> listNull = null;
        Map<String,Integer> resultsNull = RtsTest.aboveBelow(listNull,5);

        System.out.println("Result for List where list is null = "+resultsNull);
	}
}
