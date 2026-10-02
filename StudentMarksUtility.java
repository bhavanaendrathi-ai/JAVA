import java.io.*;
import java.util.Scanner;

public class StudentMarksUtility 
{	
	static int studentCount = 0;

	public static void main(String[] args) throws IOException
	{
		System.out.println("\n--------Command Line Arguments--------");
		if(args.length > 1)
		{
			System.out.println("Name : " + args[0]);
			System.out.println("Roll No : " + args[1]);
		}
		else
		{
			System.out.println("Please provide Name and Roll No");
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter course name : ");
		String course = br.readLine();

		Scanner sc = new Scanner("18 38");
		int sessional1Marks = sc.nextInt();
		int sessional2Marks = sc.nextInt();

		int sessionalMarks = sessional1Marks + sessional2Marks;

		Integer marksObject = Integer.valueOf(sessionalMarks);

		System.out.println("\nWrapper object : " + marksObject);

		String learningEngagementMarksObject = "21";
		int learningEngagementMarks = Integer.parseInt(learningEngagementMarksObject);

		Integer total = sessionalMarks + learningEngagementMarks;

		int finalMarks = total;
		sc.close();

		studentCount++;

		System.out.println("\n-------- Student Details --------");
		System.out.println("Course : " + course);
		System.out.println("Sessional Marks : " + sessionalMarks);
		System.out.println("Learning Engagement Marks : " + learningEngagementMarks);
		System.out.println("Final Marks : " + finalMarks);
		System.out.println("Student Registered: " + studentCount);

	}
}