/*
* This java program is a subclass of the Employee class,
* extending it to add details for Salesmen who are also employees.
*/

public class Salesman extends Employee {
    // Initializing additional variables
    private double annualSales;

    // Constructor
    public Salesman(int year, String name, double monthlyPay, double annualSales) {
          super(year, name, monthlyPay);
          this.annualSales = annualSales;
    } // end of constructor

    // Overriden method annualSalary() for Salesman
    @Override
    public double annualSalary() {
          double commission = .02 * this.annualSales;
          // maximum of $20000 commission
          if (commission > 20000) {
                commission = 20000;
          }
          return super.annualSalary() + commission;
    } // end of method

    // Overridden toString() method
    @Override
    public String toString() {
          return super.toString() + " Annual Sales: $" +
          Math.round(this.annualSales) + "\n";
    } // end of method

    // Getters and Setters methods
    @Override
    public String getName() {
          return super.getName();
    } // end of method

    @Override
    public int getYear() {
          return super.getYear();
    } // end of method

    @Override
    public double getMonthlyPay() {
          return super.getMonthlyPay();
    } // end of method

    public double getAnnualSales() {
          return annualSales;
    } // end of method

    @Override
    public void setName(String name) {
          super.setName(name);
    } // end of method

    @Override
    public void setYear(int year) {
          super.setYear(year);
    } // end of method

    @Override
    public void setMonthlyPay(double monthlyPay) {
          super.setMonthlyPay(monthlyPay);
    } // end of method

    public void setAnnualSales(double annualSales) {
          this.annualSales = annualSales;
    } // end of method
} // end of subclass
