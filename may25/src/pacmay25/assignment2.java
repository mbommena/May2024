package pacmay25;
//assignment 1 - (((((((10*2)-2)+2)-2)/2))//

public class assignment2 {
	public int mul(int a, int b) {
		int c=a*b;
		System.out.println("sum is = " + c);
		return c;
	}
	public int sub(int a, int b) {
		int c=a-b;
		System.out.println("sub is = " + c);
		return c;
	}
	public int add(int a, int b) {
		int c=a+b;
		System.out.println("mul is = " + c);
		return c;
	}
	public int sub1(int a, int b) {
		int c=a-b;
		System.out.println("mul is = " + c);
		return c;
	}
	public int div(int a, int b) {
		int c=a/b;
		System.out.println("div is = " + c);
		return c;
	}
	public static void main (String[] args) {
		assignment2 assign = new assignment2();
		int mul=assign.mul(10, 2);
		int sub1=assign.sub(mul, 2);
		int add =assign.add(sub1,2);
		int sub2=assign.sub(add,2);
		int div=assign.div(sub2,2);
		System.out.println("Final result =" +div);
	}
	}