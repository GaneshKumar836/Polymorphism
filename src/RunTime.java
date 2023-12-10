
class Age
{
	int age;
	String name;
	String qualification;
	
	void details(int age,String name,String qualification)
	{
		this.age=age;
		this.name=name;
		this.qualification=qualification;
		System.out.println(age+" "+name+" "+qualification);
	}
}
class Name extends Age
{
	void details(int age,String name,String qualification)
	{
		//this.age=age;
		//this.name=name;
		//this.qualification=qualification;
		System.out.println(age+" "+name+" "+qualification);
	}
	
}
class Qualification extends Name
{
	void details(int age,String name,String qualification)
	{
		//this.age=age;
		//this.name=name;
		//this.qualification=qualification;
		System.out.println(age+" "+name+" "+qualification);
	}
	
}
public class RunTime {

	public static void main(String[] args) {
		Qualification q=new Qualification();
		q.details(23,"ganesh","b.tech");
		q.details(24," satish","10th");
		q.details(23,"eswar", "b.tech");
	}

}
