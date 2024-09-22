import java.util.*;
 class Employee {
    int salary = 60000;
}

class Engineer extends Employee {
    int benefits = 10000;
}

public class Gfg
{
	public static void main(String[] args) {
		//Prinint the values of the inherited classes 
		Engineer E1 = new Engineer();
		System.out.println("The salary of the Employee is " + E1.salary + " Benefits of the employeee is  " + E1.benefits);
	}
}
