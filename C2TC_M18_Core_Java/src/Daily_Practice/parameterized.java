package Daily_Practice;


class parameterconstructor
{
	

	void add(int a, int b)
	{
		System.out.println("add :"+(a+b));
		
	}
	void name(String s, int i)
	{
		System.out.println("name :"+s  +"\n" + "id :"+i);
	}
	
}
public class parameterized {

	public static void main(String[] args) {
		parameterconstructor pm=new parameterconstructor ();
		pm.add(2, 22);
		pm.name("Archana", 2);
		
	}

}
