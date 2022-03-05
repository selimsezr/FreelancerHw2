package Task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SalariedEmployee extends Employee {
	private int salary = 4200;
	public SalariedEmployee(String name, String surname) {
		super(name, surname);
		// TODO Auto-generated constructor stub
	}
	public int getSalary() {
		return this.salary;
	}
	@Override
	void printEmp() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(getName()+".txt"));
			String txt = "Name: " + getName() + "\tSurname: " + getSurname()
			+"\nType: Salaried Employee" + "\tSalary" + getSalary();
			writer.write("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	int setSalary(int salary) {
		String setSalary = "UPDATE Employees SET Salary ='" + this.salary + "' WHERE Salary = '" + getSalary()
				+ "'";
		try (Connection connection = database.connect();
				PreparedStatement pStatement = connection.prepareStatement(setSalary)) {
			pStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return salary;
	}
	void addEmp(String name, String Surname) {

		String addEmpl = "INSERT INTO Employees(Name, Surname, Type, Salary) VALUES('" + name + "','" + Surname
				+ "','Salaried Employee','" + getSalary()+"')";
		try (Connection connection = database.connect();
				PreparedStatement pStatement = connection.prepareStatement(addEmpl)) {
			pStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
