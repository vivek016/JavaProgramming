package Collections.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		 List<String> colors = new ArrayList<>();
		  colors.add("Red");
		  colors.add("Green");
		  colors.add("Orange");
		  colors.add("White");
		  colors.add("Black");
		  System.out.println(colors);
		  
		  colors.add(0, "Pink");
		  colors.add(5, "Yellow");
		 
		  System.out.println(colors);
		

	}

}
