import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args){
        Scanner sc= new Scanner(System.in);     
System.out.print("Enter your year of birth (YYYY): ");  
int year = sc.nextInt();  
System.out.print("Enter your current salary: "); 

 while (!sc.hasNextDouble()) {
      System.out.println("Input is not a number. Please enter only digits.");
      sc.nextDouble();
    }
  
double salary = sc.nextDouble();  

if(year>2000 && year<2004){
salary = ( 0.05 * salary ) + salary;
}
else if(year>1990 && year<2001){
salary =  ( 0.10 * salary) + salary;
}
else if (year>1970 && year<1991){
salary =  ( 0.20 * salary) + salary;
}
else{
salary = salary;
}

System.out.println("Your salary and bonus total is " + salary); 

sc.close();
	}
}
