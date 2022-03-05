package Task1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class Employee {
	private String name;
	private String surname;
	private String type;
	private int salary;

	Database database = new Database();

	public Employee(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		String setName = "UPDATE Employees SET Name ='" + this.name + "' WHERE Name = '" + getName() + "'";
		try (Connection connection = database.connect();
				PreparedStatement pStatement = connection.prepareStatement(setName)) {
			pStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
		String setSurname = "UPDATE Employees SET Surname ='" + this.surname + "' WHERE Surname = '" + getSurname()
				+ "'";
		try (Connection connection = database.connect();
				PreparedStatement pStatement = connection.prepareStatement(setSurname)) {
			pStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void delEmp(String name, String surName) {
		String delEmpl = "DELETE FROM Employees WHERE name = '" + name + "' AND '" + surname + "'";
		try (Connection connection = database.connect();
				PreparedStatement pStatement = connection.prepareStatement(delEmpl)) {
			pStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	abstract void printEmp();
	abstract int getSalary();
	abstract int setSalary(int salary);
	abstract void addEmp(String name, String Surname);
}
