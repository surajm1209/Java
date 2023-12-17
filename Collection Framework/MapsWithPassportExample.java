import java.util.*;
import java.util.Map.Entry;
class Information
{
	private String name;
	private int age;
	private String fatherName;
	private String city;
	public Information(String name , int age, String fatherName, String city)
	{
		this.name=name;
		this.age=age;
		this.fatherName=fatherName;
		this.city=city;		
	}
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getFatherName() {
		return fatherName;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString()
	{
		return name + " " + age + " " + fatherName + " " + city;
	}
}

public class MapsWithPassportExample 
{
	public static void main(String[] args) 
	{
		Information info1= new Information("Suraj Mishra", 27, "Jayshankar", "Bilimora");
		Information info2= new Information("Shubham Deshpande", 28, "Sureshrao", "Parbhani");
		Information info3= new Information("Aman Singh", 29, "Suman", "Pune");

		HashMap hm=new HashMap();
		hm.put(111, info1);
		hm.put(222, info2);
		hm.put(333, info3);
		
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry passport=(Entry) itr.next();
			System.out.println("Passport Number : "+ passport.getKey() + " : Info : "+ passport.getValue());
		}
		
	}

}
