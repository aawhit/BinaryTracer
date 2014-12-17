import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class BinaryTracer
	{
	private static int target;
	private static int left=0;
	private static int middle;
	private static int right;
	private static int arrayMiddle;
	private static int leftAnswer;
	private static int rightAnswer;
	private static int middleAnswer;
	private static int userValue;
	static ArrayList newArray = new ArrayList();

	public static void main(String[] args)
		{
		createArray();
		chooseTarget();
		findTarget();
		}
	public static void createArray()
		{
		int number=0;
		while (number != -1)
			{
			System.out.println("Please enter numbers between 1 and 20 to be entered into an array. When you are done enter a -1.");
			Scanner userInput1 = new Scanner(System.in);
			number = userInput1.nextInt();
			if (number == -1)
				{
				
				}
			else if (number>20)
				{
				
				}
			else if (number<1)
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
		target = (int) (Math.random()*newArray.size());
		target =  (Integer) newArray.get(target);
		System.out.println("The target is: " + target);
		}
	
	public static int findTarget()
		{
		int counter = 0;
		int counterRight = 0;
		int left = 0;
		int right = newArray.size() - 1;
		while (left <= right)
			{
			int middle = (left + right) / 2;
			System.out.println("What is the left index?");
			Scanner userInput2 = new Scanner(System.in);
			leftAnswer = userInput2.nextInt();
			if (leftAnswer == left)
				{
				System.out.println("Well done!");
				counterRight++;
				}
			else 
				{
				System.out.println("The correct answer is " + left);
				}
			counter++;
			System.out.println("What is the right index?");
			Scanner userInput3 = new Scanner(System.in);
			rightAnswer = userInput3.nextInt();
			if (rightAnswer == right)
				{
				System.out.println("Correct!");
				counterRight++;
				}
			else
				{
				System.out.println("The correct answer is " + right);
				}
			counter++;
			System.out.println("What is the middle index?");
			Scanner userInput4 = new Scanner(System.in);
			int middleAnswer = userInput4.nextInt();	
				if (middleAnswer== middle)
				{
				System.out.println("Nice!");
				counterRight++;
				}
				else
				{
				System.out.println("The correct answer is " + middle);
				}
				counter++;
			System.out.println("What is the middle value?");
			Scanner userInput5 = new Scanner(System.in);
			int userValue = userInput5.nextInt();
			if (userValue == (Integer)newArray.get(middle))
				{
				System.out.println("Correct!");
				counterRight++;
				}
			else 
				{
				System.out.println("The correct answer is " + (Integer)newArray.get(middle));
				}
			counter++;
			if ((Integer)newArray.get(middle) == target)
			{
				break;
			}
			if (target < (Integer)newArray.get(middle))
				{
				right = middle - 1;

				}
			if (target > (Integer)newArray.get(middle))
				{
				left = middle + 1;

				} 
			}
		System.out.println("Your score was " + counterRight + " out of " + counter);
		return -1;
		}
	}
