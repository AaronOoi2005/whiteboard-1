public class p4 {

    public p4() {
    }
    
    public static void main(String[] args){
		int num1[] = {4,5,2,3,1,6};
		int num2[] = {8,7,6,9,4,5};
		System.out.printf("Intersect: ");
		for (int i=0;i<6;i++){
			for (int j=0;j<6;j++){
				if (num1[i]==num2[j])
					System.out.printf("%d ",num1[i]);
			}
		}
    }

}