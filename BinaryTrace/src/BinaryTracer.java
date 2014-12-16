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
	private static int userLeft;
	private static int userRight;
	private static int userMiddle;
	private static int userValue;
	static ArrayList newArray = new ArrayList();

	public static void main(String[] args)
		{
		createArray();
		chooseTarget();
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
		target = (int) newArray.get(target);
		System.out.println("The target is: " + target);
		}
	public static int findTarget()
		{
		int left = 0;
		int right = newArray.size() - 1;
		while (left <= right)
			{
			int middle = (left + right) / 2;
			if (target < (int)newArray.get(middle))
				{
				right = middle - 1;
				}
			else if (target > (int)newArray.get(middle))
				{
				left = middle + 1;
				}
			else
				{
				return middle;
				}
			}
		return -1;
		}
	}
