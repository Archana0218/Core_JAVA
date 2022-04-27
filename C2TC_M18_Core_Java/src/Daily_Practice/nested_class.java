package Daily_Practice;

public class nested_class {
	private static String str = "Hi";

	static class nestedclass {
		public void display()

		{
			System.out.println(str);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nestedclass nc = new nestedclass();
		nc.display();

	}

}
