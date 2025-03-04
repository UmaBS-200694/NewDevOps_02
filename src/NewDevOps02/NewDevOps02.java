package NewDevOps02;

public class NewDevOps02 {
	static int i1;
	static int i2;

	public static void main(String[] args) {
  i1=20;
  i2=30;
  addTion();
  SubtracTion();
  DiviSion();

	}
	public static void addTion() {
		
		int sum=i1+i2;
		System.out.println("Sum of two numbers: " + sum );
	}

public static void SubtracTion() {
		
		int sub=i1-i2;
		System.out.println("Subtraction of two numbers: " + sub );
	}
	public static void DiviSion() {
		
		int Div=i1/i2;
		System.out.println("Devision of two numbers: " + Div );
	}

}
