package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> hm = new HashMap<String, Integer>();
		String s = "naveen reddy sirisha reddy seshu reddy jyothi reddy sirisha seshu sirisha";

		String[] s1 = s.split(" ");
		int count = 1;
		int c = 1;
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
			if (hm.containsKey(s1[i])) {
				int cc = hm.get(s1[i]);
				hm.replace(s1[i], cc, cc + 1);

			} else {

				hm.put(s1[i], count);
			}
		}
		System.out.println(hm);
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			set.add(s1[i]);
		}
		System.out.println(set);
		
		
	}

}
