import java.util.*;
public class RainFall {
	
	public static double m1(double[] rf) {
		double total = 0;
		for(int i=0;i<rf.length; i++) {
			total+=rf[i];
		}
		return total;
	}
	
	
	
	
	public static int m3(double[] rf) {
		double lowest = rf[0];
		int ind = 0;
		for(int i=0;i<rf.length; i++) {
			if(lowest>rf[i]) {
				lowest=rf[i];
				ind=i;	
		}
		
	}
		return ind;
		
	}
	
	public static int m4(double[] rf) {
		double highest = rf[0];
		int ind = 0;
		
		for(int i=0;i<rf.length; i++) {
			if(highest<rf[i]) {
				highest=rf[i];	
				ind=i;	
		}
		
	}
		return ind;
	}
	
	
	
	public static void main(String Args []) {
		
		
		double[] rainfall = new double[12] ;
		
		
		Scanner scan = new Scanner(System.in);
		
		
		for(int i = 0; i<rainfall.length; i++) {
			System.out.println("Insertamount of rainfall for month #"+(i+1));
			rainfall[i] = scan.nextInt();
			while(rainfall[i]<0 || rainfall[i]>200) {
				System.out.println("please enter a realistic amount of rainfall");
				i--;
			}
		}
		
		
		double total = m1(rainfall);
		double average = total/rainfall.length;
		int lowest = (m3(rainfall)+1);
		int highest =(m4(rainfall)+1);
		
		
		System.out.println("==============================\nTotal amount of rainfall:\t\t"+total);
		
		System.out.printf("Average amount of rainfall:\t\t%.2f\n",average);
		
		System.out.println("Month #"+highest+" had the highest rainfall of\t"+rainfall[highest-1]);

		System.out.println("Month #"+lowest+" had the lowest rainfall of\t"+rainfall[lowest-1]);
		
		
		
		
		
		
		
		
		
		
	}
}
