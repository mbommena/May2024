package pacmay25;

public class student {
	int age;
	int rollnumber;
	public void Display1() {
		System.out.println("WELCOME TO YOU ALL");
	}
	public void Display2() {
		System.out.println("AUTOMATION IS EASY");
	}
	public static void main(String[] args) {
		student name =new student();
		name.Display1();
		name.Display2();
		name.age=30;
		name.rollnumber=9;
		System.out.println("age is :"+name.age);
		System.out.println("rollnumber is :"+name.rollnumber);
	}
}
