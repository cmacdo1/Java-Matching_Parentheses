// ********************************************************************
// ParenMatch.java
//
// Determines whether or not a string of characters contains
// matching left and right parentheses.
// ********************************************************************

import java.util.*;

public class ParenMatch
{
	public static void main (String[] args)
	{
		Stack<Character> s = new Stack<Character>();
		String line; // the string of characters to be checked
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("Parenthesis Matching");
		System.out.print ("Enter a parenthesized expression: ");
		line = scan.nextLine();
		scan.close();
		// loop to process the line one character at a time
		for (int i = 0; i < line.length(); i++)
		{
			char c = line.charAt(i);
			
			if(c == '(')
			{
				//open parenthesis, add to stack
				s.push(c);
			}
			else if(c == ')')
			{
				//hit close parenthesis, pull open parenthesis off the stack
				if(s.size()>0)
				{
					s.pop();
				}
				else
				{
					//stack does not have a matching parenthesis, show error
					System.out.println("Error! Close parenthesis without a matching open parenthesis");
					return;
				}
			}
		}
		
		// check final stack
		if(s.size() > 0)
		{
			System.out.println("Error! Open parenthesis without a matching closed parenthesis");
		}
		else
		{
			System.out.println("The number of open parenthesis matched the number of closed parenthesis");
		}
	}
}
