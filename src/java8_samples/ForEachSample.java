package java8_samples;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import edu.nycenet.hsaps.datastructure.CodeNameHolder;

public class ForEachSample {
	public static void parseList() {
		List<Object> myList = new ArrayList<>();
		myList.add(new CodeNameHolder("A","a"));
		myList.add(new CodeNameHolder("B","b"));		
		myList.add(new CodeNameHolder("C","c"));		
		myList.add(new CodeNameHolder("D","d"));
//		myList.forEach((item)->System.out.println(item));
//		System.out.println("".compareTo("ABC"));
		
		
		String code ="R";
	long output =  myList.stream().filter(item->((CodeNameHolder)item).getCode().equals(code)).count();
	System.out.println(output);
	}
	public static void main(String[] args) {
		parseList();
	}

	public void readFile() {
		String path ="";
		File f= new File(path);
	}
}
