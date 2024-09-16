import java.util.Scanner;
import javax.swing.JOptionPane;

public class Emily_Speckman_Assignement2 {
	public static void main(String[] args)
	{
		//Defining variables
		String firstName;
		char middleInitial;
		String lastName;
		int age;
		double grossAnnualPay;
		double taxRate;
		double netAnnualPay;
		
		//collecting info
		firstName = JOptionPane.showInputDialog("Please enter your first name:");
		
		String inputString =  JOptionPane.showInputDialog ("Please enter your middle initial:");
		middleInitial = inputString.charAt(0);
		
		lastName = JOptionPane.showInputDialog("Please enter your flast name:");
		
		String inputAge =  JOptionPane.showInputDialog("Please enter your age:");
		age = Integer.parseInt(inputAge);
		
		String inputGrossAnnualPay =  JOptionPane.showInputDialog("Please enter your groos annual pay:");
		grossAnnualPay = Double.parseDouble(inputGrossAnnualPay);
		
		String inputTaxRate =  JOptionPane.showInputDialog("Please enter your tax rate:");
		taxRate = Double.parseDouble(inputTaxRate);
		
		netAnnualPay= grossAnnualPay - (grossAnnualPay * taxRate);
		
		
		
		//Printing info
		System.out.print("Hello" + firstName + " " + middleInitial + " " 
				+ lastName +",\n" +  "You are" + age + "years old now.\n" + 
				"It is amazing that you made $" + grossAnnualPay +
				" this year. With the tax \n rate of " + taxRate + ", you can take home $" 
				+ netAnnualPay);
		System.exit(0);	
	}
}
