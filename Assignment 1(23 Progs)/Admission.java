import java.util.Scanner;
public class Admission{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Marks in Math:");
		int mathMarks=scan.nextInt();
		System.out.print("Enter Marks in Physics:");
		int phyMarks=scan.nextInt();
		System.out.print("Enter Marks in Chemistry:");
		int chemMarks=scan.nextInt();
		if (mathMarks >= 60) {
			if (phyMarks >= 50) {
				if (chemMarks >= 40) {
					if (((mathMarks + phyMarks + chemMarks) >=200) || ((mathMarks + phyMarks) >=150)) {
						System.out.println("Candidate is Eligible");
					}
				}
			}
		}
		else
		{
			System.out.println("Candidate is not Eligible");
		}
	}
}