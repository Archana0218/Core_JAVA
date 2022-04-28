package Daily_Practice;


class student
{
	int id;
	String s;
	void info()
	{
	 id=2;
	 s="Archana";
		System.out.println(" student info:" +"id "+id +" " +"name: " +s);
	}
}
public class default_const {

	public static void main(String[] args) {
		
 student h=new student();
 h.info();
	}

}
