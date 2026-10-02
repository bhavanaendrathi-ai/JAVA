import java.util.Scanner;

public class StudentGradeReport {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    while(true) {

      System.out.println("\nEnter the roll number: ");
      int roll_no = sc.nextInt();
      sc.nextLine();

      System.out.println("Enter Student Name:");
      String name = sc.nextLine();

      System.out.println("Enter Attendance Percentage:");
      int attendance = sc.nextInt();

      if(attendance >= 75) {
        System.out.println("Attendance Status: Eligible");
      } else {
        System.out.println("Attendance Status: Not Eligible");
        continue;
      }

      System.out.println("List of Courses: ");
      String[] subjects = {"Java", "Python", "C", "COA", "CN"};

      int i = 0;
      while(i < subjects.length) {
        System.out.println(subjects[i]);
        i++;
      }

      int marks[] = new int[5];

      System.out.println("Enter marks for 5 subjects: ");
      for(int k = 0; k < 5; k++) {
        marks[k] = sc.nextInt();
      }

      int sum = 0;
      for(int m : marks) {
        sum += m;
      }

      float percentage = ((float) sum / 500) * 1000;
      int j = 1;
      System.out.println("Countdown to announce the results:");
      do
      {
          if (j == 4)
              break;

          System.out.println(j + "......");
          j++;
      }
      while (j <= 5);

      System.out.println("Total marks: " + sum);
      System.out.println("Percentage: " + percentage);

      switch ((int) percentage / 10)
      {
        case 10:
        case 9:
            System.out.println("Grade: A+");
            break;

        case 8:
            System.out.println("Grade: A");
            break;

        case 7:
            System.out.println("Grade: B");
            break;

        case 6:
            System.out.println("Grade: C");
            break;

        case 5:
            System.out.println("Grade: D");
            break;

        default:
            System.out.println("Grade: F");
      }

      System.out.println("Thank You!");
      System.out.println("Would you like to exit? (y/n (only))");
      String choice = sc.next();
      if("n".equals(choice)) {
        break;
      }

    }

    sc.close();
  }
}
