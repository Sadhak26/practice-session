abstract class College{

int clgid;
String name;

College(int a,String b){
 this.clgid=a;
 this.name=b;
}

void display()
{
System.out.println("College Id: "+clgid + "\tCollege Name: "+name);
}

abstract void dept(int stud,String deptname);
}


class Details extends College{
    Details(int a, String b)
	{
	 super(a,b);
	}
	void dept(int stud,String deptname)
	{
	 System.out.println("\nDepartname Name: "+deptname);
	 System.out.println("\nNumber of Student Present in "+deptname+" is "+stud);
	}
}
	
	class CollegeDepartment{
	public static void main(String args[]){
	  Details n = new Details(2022,"SKP Engineering College");
	  n.display();
	  n.dept(23,"Mechanical Engineering");
	}
	}