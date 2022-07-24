
public class student {

	int roll;
	String name;
	String college;
	
	public student(int roll, String name, String college) {
		super();
		this.roll = roll;
		this.name = name;
		this.college = college;
	}
	void display()
	{
		System.out.println(roll +" "+ name+" "+college);
	}
	public static void main(String[] args) 
	{
	student s1=new student(1,"yash","Pillai");
	student s2=new student(2,"anusha","KGCE");
    s1.display();
    s2.display();
	}

}
