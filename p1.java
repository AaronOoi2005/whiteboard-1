public class p1 {

    public p1() {
    }
    
    public static void main(String[] args) {
    	int temp = 0;
		int number[]={21,400,8,-3,77,99,-16,55,111,-36,28};
		System.out.printf("Before: ");
		for (int i=0; i<number.length; i++){
			System.out.print(number[i] + ", ");
		}
		System.out.printf("\nAfter: ");
 		for (int i=0; i<number.length; i++){
            //inner
            for (int j = i + 1; j < number.length; j++) {
                //reset
                temp = 0;
                //lower
                if (number[j] < number[i]) {

                    //Swap
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }

            // Printing sorted array elements
            System.out.print(number[i] + ", ");
        }
    }
}