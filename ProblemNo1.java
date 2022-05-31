package assessment.A1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ProblemNo1 {
	
		public static String higestString(String arr) 
		{
			String temp=" ";
			String[] a = arr.split(" ");
			for(String i:a) {
				if(temp.length()<i.length()) 
				{
					temp=i;
				}
			}
			String result="";
			for(int i = 0; i<temp.length();i++) 
			{
				String start="*";
				result+= temp.charAt(i);
				for(int j=0; j<=i;j++)
				{
					result+="*";
				}
			}
			return result;
		}

		public static void main(String[] args) throws IOException 
		{
			File file = new File("C:\\Users\\COMP\\Desktop\\Test\\LongestWord\\Exp.txt");
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String line;
			while ((line = buffer.readLine()) != null) 
			{
				System.out.println(higestString(line));
			}
		}
	}