package CTSDemo;
class Employee {
	int employeeid;
	String name;
	Employee(int employeeid,String name)
	{
		this.employeeid=employeeid;
		this.name=name;
		
	}}

public class arrayobjects {
	public static void main(String args[])
	{
		Employee[] employeeArray;
		employeeArray=new Employee[5];
		employeeArray[0]= new Employee(1,"Dharma Teja");
		employeeArray[1]= new Employee(2,"Haritha");
		employeeArray[2]= new Employee(3,"Kalyan babu");
		employeeArray[3]= new Employee(4,"Narasimha rao");
		employeeArray[4]= new Employee(5,"ramprasad");
		for (int i =0;i<employeeArray.length;i++)
			System.out.println("ELement at "+i+":"+employeeArray[i].employeeid+" "+ employeeArray[i].name);
	}
	}


