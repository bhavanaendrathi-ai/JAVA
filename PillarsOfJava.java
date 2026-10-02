abstract class Course {
  private String name;
  private int credits;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCredits() {
    return credits;
  }

  public void setCredits(int credits) {
    if(credits < 0) {
      System.out.println("Credits can't be negative.");
    } else {
      this.credits = credits;
    }
  }

  public abstract void showDetails();

  public double calculateWorkload() {
    return credits * 10;
  }
}

class TheoryCourse extends Course {
  @Override
  public void showDetails() {
    System.out.println("Theory Course : " + getName() + ", Credits : " + getCredits());
  }
}

class LabCourse extends Course {
  @Override
  public void showDetails() {
    System.out.println("Lab Course : " + getName() + ", Credits : " + getCredits());
  }

  @Override
  public double calculateWorkload() {
    return getCredits() * 10 + 10;
  }
}

public class PillarsOfJava {
  public static void main(String[] args) {

    TheoryCourse theory1 = new TheoryCourse();
    theory1.setName("Computer Networks");
    theory1.setCredits(4);

    TheoryCourse theory2 = new TheoryCourse();
    theory2.setName("Coursera Course");
    theory2.setCredits(-4);

    LabCourse lab = new LabCourse();
    lab.setName("OOP Lab");
    lab.setCredits(2);

    theory1.showDetails();
    theory2.showDetails();
    lab.showDetails();

    System.out.println("Theory Workload : " + theory1.calculateWorkload() + " hours");
    System.out.println("Theory Workload : " + theory2.calculateWorkload() + " hours");
    System.out.println("Lab Workload : " + lab.calculateWorkload() + " hours");

  }
}