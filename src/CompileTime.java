class MethodOverloading
{
	int age;
	String name;
	String qualification;
	
	
	void details(int age)
	{
		this.age=age;
		System.out.println(age);
	}
	void details(int age,String name)
	{
		this.age=age;
		this.name=name;
		System.out.println(age+" "+name);
		
	}
	void details(int age,String name,String qualification )
	{
	     this.age=age;
	     this.name=name;
	     this.qualification=qualification;
	     System.out.println(age+" "+name+" "+qualification);
	}
	
}




public class CompileTime {

	public static void main(String[] args) {
		
		MethodOverloading m=new MethodOverloading();
		m.details(23);
		m.details(23,"ganesh");
		m.details(23,"ganesh", "b,tech");
		
	}

}
