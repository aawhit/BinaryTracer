import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinaryTracer
	{

	public static void main(String[] args)
		{
		createArray();

		}
	public static void createArray()
		{
		ArrayList newArray = new ArrayList();
		int number=0;
		while (number != -1)
			{
			System.out.println("Please enter numbers to be entered into an array. When you are done enter a -1.");
			Scanner userInput1 = new Scanner(System.in);
			number = userInput1.nextInt();
			if (number == -1)
				{
				
				}
			else
				{
				newArray.add(number);
				}
			}
		Collections.sort(newArray); 
		System.out.println("Here is the array " + newArray);
		}
	public static void chooseTarget()
		{
		
		}
	}
