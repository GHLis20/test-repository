package java_practice;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Main{
	public static void main(String args[]) throws IOException {
		Scanner scanner = new Scanner(new File("C:\\Users\\ASUS\\Desktop\\1.inp"));
		int first = 0;
		String trash;
		List<String> listA = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			if ( first != 0) {
				String str = scanner.nextLine();
				//System.out.println(str);
				listA.add(str);
			}
			else {
				first++;
				trash = scanner.nextLine();
			}
		}
		System.out.println(listA);
	}
}
