/*
* This java program computes the salaries for a collections of
* employees of different types. It has two subclasses whose names identify
* the type of worker they function for: Salesman and Executive.
*/

// Import of necessary Java classes
import java.text.DecimalFormat;

public class Employee {
      // Initializing variables
      private String name;
      private int year;
      private double monthlyPay;

      // Creating DecimalFormat object to round salaries
      static DecimalFormat round = new DecimalFormat("#.00");
      
      // Constructor
      public Employee(int year, String name, double monthlyPay) {
            this.year = year;
            this.name = name;
            this.monthlyPay = monthlyPay;
      } // end of constructor

      // annualSalary() method
      public double annualSalary() {
            return this.monthlyPay * 12;
      } // end of method

      // toString() method
      public String toString() {
            return "\n Employee Name: " + this.name +
            "\n Monthly Salary: $" + Math.round(this.monthlyPay) + "\n";
      } // end of method

      // Getters and Setters methods
      public String getName() {
            return name;
      } // end of method

      public int getYear() {
            return year;
      } // end of method

      public double getMonthlyPay() {
            return monthlyPay;
      } // end of method

      public void setName(String name) {
            this.name = name;
      } // end of method

      public void setYear(int year) {
            this.year = year;
      } // end of method

      public void setMonthlyPay(double monthlyPay) {
            this.monthlyPay = monthlyPay;
      } // end of method
} // end of superclass