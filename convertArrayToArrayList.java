package Collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class convertArrayToArrayList {

	public static void main(String[] args) {
	
		
		Integer []arr= {10,12,34,12,6};
		
		//method 1
		 List<Integer> ls = Arrays.asList(arr);          
	      System.out.println(ls);
		
		
	    //Method 2 
	      List<Integer> list2 = new ArrayList<>();
	      for(int i:arr) {
	         list2.add(i);
	      }
	      

    


}
}
