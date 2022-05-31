package assessment.A1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ProblemNo3
{
	static int beautyOfString(String string)
	{
		int sum = 0;
		string = string.replaceAll("[^a-zA-Z]", "").toLowerCase();
		
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i<string.length(); i++)
		{
			Character c = new Character(string.charAt(i));
			Integer val = map.get(c);
			
			if(val != null)
			{
				map.put(c, new Integer(val+1));
			}
			else
			{
				map.put(c, new Integer(1));
			}
		}
		
		Integer[] values = map.values().toArray(new Integer[map.size()]);
		Arrays.sort(values);
		Collections.reverse(Arrays.asList(values));
		
		int temp = 26;
		for(int i = 0; i<values.length; i++)
		{
			sum += (temp*values[i]);
			temp--;
		}
		return sum;
	}

public static void main(String args[])
{
	String s="ABbCcc";
	int a=ProblemNo3.beautyOfString(s);
	System.out.println(a);
	
	String s1="Good luck in the Facebook Hacker Cup this year";
	int a1=ProblemNo3.beautyOfString(s1);
	System.out.println(a1);
	
	String s2="Ignore punctuation, please";
	int a2=ProblemNo3.beautyOfString(s2);
	System.out.println(a2);
	
	String s3="Sometimes test cases are hard to make up";
	int a3=ProblemNo3.beautyOfString(s3);
	System.out.println(a3);
	
	String s4="So I just go consult Professor Dalves";
	int a4=ProblemNo3.beautyOfString(s4);
	System.out.println(a4);
}
}