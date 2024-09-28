import java.util.Scanner;

public class p8 {

    public p8() {
    }
    
    static boolean isAnagram(String str1, String str2) {
   		for (int i = 0; i < str1.length(); i++) {
        	char ch = str1.charAt(i);

        if (str2.indexOf(ch) == -1) 
            return false;
        else
            str2 = str2.replaceFirst(String.valueOf(ch), " ");
    }

    return true;
	}
	

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
		System.out.print("Enter sentence 1: ");
		String str1 = scanner.next();

		System.out.print("Enter sentence 2: ");
		String str2 = scanner.next();
		
		//remove space
		str1 = str1.replaceAll("\\s", "");
		str2 = str1.replaceAll("\\s", "");
		
		//remove punctuation
		str1 = str1.replaceAll("\\p{Punct}","");
		str2 = str2.replaceAll("\\p{Punct}","");
			
 		System.out.println("Anagram is " + isAnagram(str1.toLowerCase(),str2.toLowerCase()));;
    	

    }
}