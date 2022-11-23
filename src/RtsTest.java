import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RtsTest {
	public static Map<String,Integer> aboveBelow(List<Integer> list, int value){

		Map<String, Integer> result = new HashMap<>();
		Integer countAbove = 0;
		Integer countBelow = 0;
		
		//Below code handles edge case if list is  null
		if(list == null) {
			result.put("above",countAbove);
	        result.put("below", countBelow);
	        return result;
		}
		
		/*This block is replacement for for loop, used Java 8 stream.
		 * 
		 * int collectAbove = (int) list.stream().filter(x -> x > value).count();
        int collectBelow = (int) list.stream().filter(x -> x < value).count();*/

		
		//traverse through each num to count below and above
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
		
		//rotating the string is same as trimming and appending it ahead 
		String result = str.substring(num) + str.substring(0, num);
		return result;
	}
}
