import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class BooleanChecker {
	@Test
	public void test1() throws ParseException {
		List<Boolean> list = Arrays.asList(true,false,true,true,false,false,false,true,false,true,true,false,false,false);
		Collections.sort(list, new BoolComparer());
		System.out.println(list);
	}
}
class BoolComparer implements Comparator<Boolean> {

	@Override
	public int compare(Boolean obj1, Boolean obj2) {
			if(obj1 == obj2) {
	    		return 0;
	    	}
	    	if(obj1) {
	    		return -1;
	    	}
	    	if(obj2) {
	    		return 1;
	    	}
	    	System.out.println("Printing");
	    	return 0;
		}
}
