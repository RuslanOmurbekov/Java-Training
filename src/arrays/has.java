package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Vector;

class CommonElements {
	public static void main(String[] args) {
		String[] s1 = { "ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR" };
		String[] s2 = { "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR" };
		// HashSet<String> set = new LinkedHashSet<String>();
		String x1 = "";
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				for (int k = 0; k < s1.length; k++) {
					if (s1[i].equals(s1[k])) {
						x1 = s1[i];
						if (s1[i].equals(s2[j])) {
							x1 = s1[i];

							System.out.println(x1);
							break;
						}
					}

				}
			}

		}
		// System.out.println(set); //OUTPUT : [THREE, FOUR, FIVE]
		Vector<String> list = new Vector<String>();
		list.add("Dashboard");
		list.add("Member Search");
		list.add("Prior Auth Search");
		list.add("Pharmacy Search");
		list.add("Prescriber Search");
		System.out.println(list);
	}
}
