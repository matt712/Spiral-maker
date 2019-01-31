package package1;
import java.util.Scanner;
public class App 
{
	public static void main(String[] args)
	{
		SpiralMaker iMakeSpirals = new SpiralMaker();
		Scanner input = new Scanner(System.in);
		System.out.println("Is the spiral clockwise? [True/False]");
		boolean isClock = input.nextBoolean();
		System.out.println("How big do you want it?");
		int number = input.nextInt();
		iMakeSpirals.makeSpiralAnticlockwise(number, isClock);
		input.close();
	}
}
