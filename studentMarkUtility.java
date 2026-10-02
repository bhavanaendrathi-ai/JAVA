import java.io.*;
import java.util.Scanner;
public class StudentMarkUtility
{
	static int studentCount = 0;
	public static void main (String[] args) throws IOException
	{
		System.out.println("command line arguments");
		if(args.length >= 2 )
		{
			System.out.println("Name: " +args[0]);
			System.out.println("Roll no. : " +args[1]);
		}
		else
		{
			System.out.println("please provide name and roll number");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n enter course name: ");
		String course = br.readLine();
		Scanner sc = new Scanner ("18 38");
		int sessional_1 = sc.nextInt();
		int sessional_2 = sc.nextInt();
		int sessional_marks= sessional_1 + sessional_2;
	}
}

		
