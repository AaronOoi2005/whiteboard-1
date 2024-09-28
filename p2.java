public class p2 {

    public p2() {
    }
       
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
        	//if can divide 3 and 5
        	if (i%3==0 && i%5==0){
        		System.out.printf("FizzBuzz ");
        	}
        	//divide 3
        	else if (i%3==0){
        		System.out.printf("Fizz ");
        	}
        	//divide 5
        	else if (i%5==0){
        		System.out.printf("Buzz ");
        	}
        	//none
        	else{
        		System.out.printf("%d ",i);
        	}
        }
    }
    
}