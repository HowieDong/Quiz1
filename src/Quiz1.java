import java.util.Scanner;
public class Quiz1 {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		System.out.println("How many touchdowns;");
		int TD = reader.nextInt();
		System.out.println("How many yards:");
		int YDS = reader.nextInt();
		System.out.println("How many completions:");
		int COMP = reader.nextInt();
		System.out.println("How many interceptions:");
		int INT = reader.nextInt();
		System.out.println("How many passed attempts:");
		int ATT = reader.nextInt();
		double a = (COMP/ATT - .3)*5;
		double b = (YDS/ATT -3)* .25;
		double c = (TD/ATT)*20;
		double d = 2.375 - (INT/ATT*25);
		double e = (a+b+c+d)/6*100;
		System.out.print(e);
	}

}
