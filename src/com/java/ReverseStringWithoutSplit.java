package com.java;

public class ReverseStringWithoutSplit {

	public static void main(String[] args) {

		/*String str = "Kyrgyzstan is my country";
		int start = 0;
		int end = 0;
		String finalOutcome = "";

		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ' || str.length() - 1 == i) {
				end = i + 1;
				String cutmyString = str.substring(start, end);
				for (int j = cutmyString.length() - 1; j >= 0; j--) {
					finalOutcome += cutmyString.charAt(j);
				}

			}
			start = end;
		}
		System.out.println(finalOutcome);
	*/
		
		String str="Kyrgyzstan is my country";
		
		int start=0;
		int end=0;
		String finaloutcome= "";
		
		for(int i=0; i<=str.length() -1;i++) {
			if(str.charAt(i)==' '||str.length()-1==i) {
				end=i+1;
				String cutMyString=str.substring(start, end);
				for(int j=cutMyString.length()-1;j>=0;j--) {
					finaloutcome+=cutMyString.charAt(j);
				}
			}
			start=end;
		}
		System.out.println(finaloutcome);
		
		
		
		
		
		
	}		
}
