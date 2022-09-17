import java.util.*;


public class Lottery {



	
	
	
	public static int[] urLottery(){
		
		Scanner scan = new Scanner(System.in);

	
	
		int[] input = new int[5];
	 for(int i = 0; i<input.length; i++) {
		 System.out.println("Enter digit "+(i+1));
		 input[i] = scan.nextInt();
		 while(input[i]<0||input[i]>9) {
			 System.out.println(input[i] + " is not between 0 and 9. Please try again.");
		     i--;
		 }
				 
	 }
     		 return input;

 

}
	
	public static int Digits(int[] urLottery,int[] Lottery){
		Scanner scan = new Scanner(System.in);

		int totalcorrect = 0;

	 for(int i = 0; i<Lottery.length; i++) {
		 
		if(urLottery[i] == Lottery[i]) {
			
			totalcorrect++;
		}
	 }
	return totalcorrect;
     
 
}
	
	

	
	
	
	
	
	public static int[] LotteryNums(int[] Lottery) {
		
		return Lottery;
		
	}
	
	public static void DigitsWrong(int []inp, int[] og) {
		int[] exp = new int[(og.length - Digits(inp,og))];
		int xx = 0;
		for( int i = 0; i<og.length; i++) {
			if(!(inp[i]==og[i])) {
			exp[xx] = (i+1);
			xx++;
			
			}
			}
   System.out.println(Arrays.toString(exp));
	}
	public static void DigitsRight(int []inp, int[] og) {
		int[] exp = new int[Digits(inp,og)];
		int xx = 0;
		for( int i = 0; i<og.length; i++) {
			if((inp[i]==og[i])) {
			exp[xx] = (i+1);
			xx++;
			
			}
			}
   System.out.println(Arrays.toString(exp));
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		 Random r = new Random();
		 
		 
		 
		 
		 int[] lottery = new int[5];

		for (int i = 0; i < lottery.length; i++) {
			lottery[i] = r.nextInt(9);
				
		}
		
		LotteryNums(lottery);
			
			
		int[] yourLottery = new int[5];
		yourLottery = urLottery();




//	System.out.println(Arrays.toString(lottery));	
//	for(int i = 0; i<yourLottery.length; i++) {
//		yourLottery[i] = urLottery()[i];	
//	}
		
	int digc = Digits(yourLottery,lottery);

		
	if (digc == 5) {
		 System.out.println("You won the lottery!");
		     }else {
	    	 System.out.println(+digc + " digits matched. "); 
	     }
		
		
		
	System.out.println("Your entries:\t\t"+ Arrays.toString(yourLottery)+"\nLottery numbers:\t"+Arrays.toString(lottery));
	
	
	
	
	System.out.print("Digits correct:\t\t");
	DigitsRight(yourLottery,lottery);
	System.out.print("Digits false:\t\t");
	DigitsWrong(yourLottery,lottery);
	
	

}}
