package LabTest1;

public class LabTest1 {

	public static void main(String[] args) {
		
		
		System.out.println("1. ");
		int n[]= {1,2,3};
		System.out.print("Enter the number of items: ");
		System.out.println(n[2]);
		
		int n1 = 150;
		int q1 = 2;
		int sum1;
		double discount1;
		double paid1;
		sum1 = n1*q1;
		discount1 = sum1*0.20;
		paid1 = sum1*0.80;
		System.out.println("Enter price of first item: RM"+n1);
		System.out.println("Enter quantity of first item: "+q1);
		
		int n2 = 50;
		int q2 =3;
		int sum2;
		double discount2;
		double paid2;
		sum2 = n2*q2;
		discount2 = sum2*0.20;
		paid2 = sum2*0.80;
		System.out.println("Enter price of second item: RM"+n2);
	    System.out.println("Enter quantity of second item: "+q2);
	    
		int n3 = 30;		
		int q3 = 1;
		int sum3;
		double discount3;
		double paid3;
		sum3 = n3*q3;
		discount3 = sum3*0.10;
		paid3 = sum3*0.90;
		System.out.println("Enter price of third item: RM"+n3);
		System.out.println("Enter quantity of third item: "+q3);
		
		int sum;
		double discount;
		double paid;
		sum = sum1+sum2+sum3;
		discount = discount1+discount2+discount3;
		paid = paid1+paid2+paid3;
		System.out.println("Total price: RM"+sum);
		System.out.println("Discount received: RM"+discount);
		System.out.println("Price to be paid: RM"+paid);
		
		System.out.println("2.");
		int a1 = 500;
		int hour = 5;
		double c1 = a1*0.10;
		double w1 = (hour*5)+c1;
        System.out.println("Enter sales: RM"+a1);
		System.out.println("Enter hours worked: "+hour);
		System.out.println("Commission: RM"+c1);
		System.out.println("Daily wages: RM"+w1);
		
		
		

		
		
		
		
	
		}
		
		
		
		

		
		
		

	}


