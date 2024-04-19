package javaPrograms;

public class ReverseString {
	
	
	public static String reverseString1(String str) {
		
		StringBuilder sb= new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		String a = "RohitPawar";
//		String b = "";
//		
//		for(int i = a.length() - 1; i >= 0; i--) {
//			
//			b = b + a.charAt(i);
//		}
//		System.out.println(b);
		
//		String inputString = "RahulShettyAcademy";
//		String outputString = "";
//
//		/*
//		* Writing a for loop and looping in the reverse order to get the reverse String
//		* as output.
//		*/
//
//		for (int i = inputString.length() - 1; i >= 0; i--) {
//		outputString = outputString + inputString.charAt(i);
//		}
//
//		System.out.println(outputString);
//		}

	
		System.out.println(ReverseString.reverseString1("RohitPawar"));

	
	}
	}
//String originalStr = "Hello";
//String reversedStr = "";
//System.out.println("Original string: " + originalStr);
//    
//for (int i = 0; i < originalStr.length(); i++) {
//  reversedStr = originalStr.charAt(i) + reversedStr;
//}
//
//System.out.println("Reversed string: "+ reversedStr);
//}

