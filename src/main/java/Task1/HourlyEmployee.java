package Task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HourlyEmployee extends Employee {
//	Hourly salary: 15$
	private int salary = 15 * 40;

	public HourlyEmployee(String name, String surname) {
		super(name, surname);
	}

	public int getSalary() {
		return this.salary;
	}

	@Override
	void printEmp() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(getName() + ".txt"));
			String txt = "Name: " + getName() + "\tSurname: " + getSurname() + "\nType: Hourly Employee" + "\tSalary"
					+ getSalary();
			writer.write("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	int setSalary(int salary) {
		String setSalary = "UPDATE Employees SET Salary ='" + this.salary + "' WHERE Salary = '" + getSalary() + "'";
		try (Connection connection = database.connect();
				PreparedStatement pStatement = connection.prepareStatement(setSalary)) {
			pStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return salary;
	}

	@Override
	void addEmp(String name, String Surname) {

		String addEmpl = "INSERT INTO Employees(Name, Surname, Type, Salary) VALUES('" + name + "','" + Surname
				+ "','Hourly Employee','" + getSalary()+"')";
		try (Connection connection = database.connect();
				PreparedStatement pStatement = connection.prepareStatement(addEmpl)) {
			pStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}