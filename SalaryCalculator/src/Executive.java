/*
* This java program is a subclass of the Employee class,
* extending it to add details for Executives who are also employees.
*/
public class Executive extends Employee {
    // Initialize additional variable
    private double stockPrice;

    // Constructor
    public Executive(int year, String name, double monthlyPay, double stockPrice) {
          super(year, name, monthlyPay);
          this.stockPrice = stockPrice;
    } // end of constructor

    // Overridden method annualSalary()
    @Override
    public double annualSalary() {
          if (stockPrice > 50) { // bonus
                return super.annualSalary() + 30000;
          }
          else {                // no bonus
                return super.annualSalary();
          }
    } // end of method

    // Overridden toString() method
    @Override
    public String toString() {
          return super.toString() + " Stock Price: $" +
          round.format(this.stockPrice) + "\n";
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

    public double getStockPrice() {
          return stockPrice;
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

    public void setStockPrice(double stockPrice) {
          this.stockPrice = stockPrice;
    } // end of method
} // end of subclass
