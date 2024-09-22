import java.util.*;

class Employee {
    int salary = 60000;
}

class Engineer {
    int benefits = 10000;
}
public class Gfg
{
	public static void main(String[] args) {
		Engineer obj1 = new Engineer(); // Object of the class Engineer
// 		System.out.println("Salary of the employee is " + E1.Salary + 
// 		" Benefits of the employee is " + E1.benefits);

        System.out.println("Benefits of the employee is " + obj1.benefits);
        System.out.println("Salary of the employee is " + obj1.salary);
	}
}
