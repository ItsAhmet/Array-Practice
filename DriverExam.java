import java.util.*;
public class DriverExam {
	   private boolean missed;

public static void passed(String[] ans, String[] entr) {




}



public static int totalCorrect(String[] ans, String[] entr) {

int totalcorrect = 0;
for( int i = 0; i<entr.length; i++) {
if(ans[i].equals(entr[i])) {
totalcorrect++;
}

}

return totalcorrect;
}



public static void questionsMissed(String[] ans, String[] entr) {
	
int[] Missed = new int[ans.length-totalCorrect(ans,entr)];
int xx=0;
for( int i = 0; i<entr.length; i++) {
if(!(ans[i].equals(entr[i]))) {
Missed[xx] = (i+1);
xx++;

}
}
System.out.print(Arrays.toString(Missed));

}
	







public static void main(String args[]) {

String[] answers = {"B","D","A","A","C","A","B","A","C","D","B","C","D","A","D","C","C","B","D","A"};
String[] entered = new String[20];


Scanner scan = new Scanner(System.in);

String inp;
for(int i=0; i<entered.length; i++) {
System.out.println("Enter answer for question #"+(i+1));

inp = scan.nextLine();
entered[i] = inp.toUpperCase();

while(!(entered[i].equalsIgnoreCase("A")||entered[i].equalsIgnoreCase("B")||entered[i].equalsIgnoreCase("C")||entered[i].equalsIgnoreCase("D"))) {
System.out.println("Only enter choices: A, B, C, or D.");
i--;
}
}

//System.out.println(Arrays.toString(entered));
	int totalCorrect = totalCorrect(answers,entered);
	int totalIncorrect = answers.length-totalCorrect;
	
	
	if(totalCorrect>=15) {
		System.out.println("\n\nPassed drivers exam");
	}else {
		System.out.println("\n\nFailed drivers exam");
	}
	System.out.println("Correct answers:\t"+ totalCorrect);
	System.out.println("Incorrect answers:\t"+ totalIncorrect);
	System.out.print("Questions missed:\t");
	questionsMissed(answers,entered);

}
}
