public class bill {
 // Calculate electronics bill with 18% GST
 public static double calculateElectronicsGST(double a, double b) {
 // Add both electronics item amounts
 double amount = a + b;
 // Calculate 18% GST on the combined amount
 double gst = amount * 18 / 100;
 // Return amount including GST
 return amount + gst;
 }

 // Calculate fashion bill with 13% GST
 public static double calculateFashionGST(double c, double d) {
 // Add both fashion item amounts
 double amount = c + d;
 // Calculate 13% GST on the combined amount
 double gst = amount * 13 / 100;
 // Return amount including GST
 return amount + gst;
 }

 // Calculate food bill with 7% GST
 public static double calculateFoodGST(double e) {
 // Calculate 7% GST on the food amount
 double gst = e * 7 / 100;
 // Return food amount including GST
 return e + gst;
 }

 // Calculate total bill after GST
 public static double totalBill(
 double a, double b, double c, double d, double e) {
 // Call the three GST calculation methods
 double electronics = calculateElectronicsGST(a, b);
 double fashion = calculateFashionGST(c, d);
 double food = calculateFoodGST(e);
 // Add all amounts after GST
 return electronics + fashion + food;
 }

 // Calculate, print, and return the final bill
 public static double calculateDiscountedBill ( double a, double b, double c, double d, double
e) {
 // Get the total bill after GST
 double total = totalBill(a, b, c, d, e);
 // Calculate 20% discount on the total
 double discount = total * 20 / 100;
 // Subtract discount from total
 double payable = total - discount;
 // Print results inside this method
 System.out.printf("Total after GST = %.2f%n", total);
 System.out.printf("Discount = %.2f%n", discount);
 System.out.printf("Final payable amount = %.2f%n", payable);
 // Return final payable amount
 return payable;
 }

 // main method tocall the function
public static void main(String[] args) {
 // Pass sample values directly; no Scanner required
 calculateDiscountedBill(100, 100, 100, 100, 100);
 }
}