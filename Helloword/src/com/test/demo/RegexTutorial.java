package com.test.demo;
import java.util.regex.*;

		public class RegexTutorial {
			public static void main(String args[]) {
//				System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "java1"));
//				System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "java12"));
//				System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "JA1Va"));
//				System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "Java$"));
				System.out.println(Pattern.matches("[aeiou]+", "welcome"));
				Pattern VOWELS_PATTERN = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
				String input="Welcome";
				Matcher matched=VOWELS_PATTERN.matcher(input);
				while(matched.find()) {
					System.out.println(matched.group());
				}
				   public static boolean validateEmail(String email) {
				        // Regular expression for validating email addresses
				        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
				        Pattern pattern = Pattern.compile(regex);
				        Matcher matcher = pattern.matcher(email);
				        return matcher.matches();
				    }

			}
		

	}


