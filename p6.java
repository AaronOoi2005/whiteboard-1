import java.util.Scanner;

public class p6 {

    public p6() {
    }
    
     public static void main(String[] args) {  
     	int occur=0;
     	Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String str = scanner.next();
		
        int[] freq = new int[str.length()];  
        char maxChar = str.charAt(0);  
        int i, j, max;          
          
        //Converts string into character array  
        char string[] = str.toCharArray();  
          
        //Count each word in given string and store in array freq  
        for(i = 0; i < string.length; i++) {  
            freq[i] = 1;  
            for(j = i+1; j < string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
                    freq[i]++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
        }  
          
        //Determine maximum characters  
        max = freq[0];  
        for(i = 0; i <freq.length; i++) {  
            //If max is less than frequency of a character   
            //then, store frequency in max and corresponding character in maxChar  
            if(max < freq[i]) {  
                max = freq[i];  
                maxChar = string[i];  
            }  
        }
        	
        System.out.println("Maximum Character: " + maxChar);  
        System.out.printf("Occurence: %d", occur);  
    }  
}