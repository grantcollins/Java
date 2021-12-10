/*
* This java program demonstrates the functions of the Employee class.
*/

// Import of necessary Java classes
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.io.IOException;
import java.io.File;

public class TestEmployee {
      public static void main(String[] args) {
      // Creating arrays for 2014 and 2015 data
      Employee[] array2014 = new Employee[10];
      Employee[] array2015 = new Employee[10];

      // Creating DecimalFormat object to round currency
      DecimalFormat round = new DecimalFormat("#.00");

      // reading data from file
      try {
            File file = new File("data.txt");
            Scanner scannerIn = new Scanner(file);
            // Using counter for assigning array elements to employees
            int i = 0;
            int j = 0;
            
            while (scannerIn.hasNextLine()) {
                   // Scanning year
                   int year = scannerIn.nextInt();
                   
                        if (year == 2014) { // for 2014
                              String workerType = scannerIn.next();
                              String name = scannerIn.next();
                              double monthlyPay = scannerIn.nextDouble();

                              if (workerType.equals("Salesman")) { // for Salesman
                                    double lastValue = scannerIn.nextDouble();
                                    array2014[i] = new Salesman(year, name, monthlyPay, lastValue);
                              }

                              else if (workerType.equals("Executive")) { // for Executive
                                    double lastValue = scannerIn.nextDouble();
                                    array2014[i] = new Executive(year, name, monthlyPay, lastValue);
                              }

                              else { // for Employee
                                    array2014[i] = new Employee(year, name, monthlyPay);
                              }
                              i++;
                        } // end of outer if

                        else if (year == 2015) { // for 2015
                              String workerType = scannerIn.next();
                              String name = scannerIn.next();
                              double monthlyPay = scannerIn.nextDouble();

                              if (workerType.equals("Salesman")) { // for Salesman
                                    double lastValue = scannerIn.nextDouble();
                                    array2015[j] = new Salesman(year, name, monthlyPay, lastValue);
                              }

                              else if (workerType.equals("Executive")) { // for Executive
                                    double lastValue = scannerIn.nextDouble();
                                    array2015[j] = new Executive(year, name, monthlyPay, lastValue);
                              }

                              else { // for Employee
                                    array2015[j] = new Employee(year, name, monthlyPay);
                              }
                              j++;
                        } // end of outer else if
            } // end of while
            
            // printing data and report
            double avg2014 = 0;
            double avg2015 = 0;

            // for 2014
            System.out.println("2014 Report:");
            for (Employee worker : array2014) {
                  System.out.print(worker.toString());
                  System.out.println(" Annual Salary: $"
                          + round.format(worker.annualSalary()));
                  avg2014 += worker.annualSalary();
            } // end of For

            avg2014 /= array2014.length;
            System.out.println("\n Average Salary among Employees in 2014: $" + round.format(avg2014));

            // for 2015
            System.out.println("\n2015 Report:");
            for (Employee worker : array2015) {
                  System.out.print(worker.toString());
                  System.out.println(" Annual Salary: $"
                          + round.format(worker.annualSalary()));
                  avg2015 += worker.annualSalary();
            } // end of For

            avg2015 /= array2015.length;
            System.out.println("\n Average Salary among Employees in 2015: $" + round.format(avg2015));

      } // end of try
      // Catch statements
      catch (IOException ex) {
            System.out.println("File IO exception" + ex.getMessage());
      }

      catch (InputMismatchException ex) {
            System.out.print("Input Mismatch Exception" + ex.getMessage());
      }
      
      catch (NullPointerException ex) {
            System.out.println("Null Pointer Exception" + ex.getMessage());
      } 
      
      catch (NoSuchElementException ex) {
            System.out.println("No Such Element Exception" + ex.getMessage());
      }
    } // end of main method
} // end of class