package pacmay25;
//assignment1 - (((((((10+2)+2)-2)*2)/2))//

public class mathematics {
	public int sum(int a, int b) {
		int c=a+b;
		System.out.println("sum is = " + c);
		return c;
	}
	public int sub(int a, int b) {
		int c=a-b;
		System.out.println("sub is = " + c);
		return c;
	}
	public int mul(int a, int b) {
		int c=a*b;
		System.out.println("mul is = " + c);
		return c;
	}
	public int div(int a, int b) {
		int c=a/b;
		System.out.println("div is = " + c);
		return c;
	}
	public static void main (String[] args) {
		mathematics math = new mathematics();
		int sum1=math.sum(10, 2);
		int sum2=math.sum(sum1, 2);
		int sub=math.sub(sum2,2);
		int mul=math.mul(sub,2);
		int div=math.div(mul,2);
		System.out.println("Final result =" +div);
	}
	}
	
