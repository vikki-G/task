package sam;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Project {
	static Scanner a;
	static int ss;
	static String job ;
  public static void empname() {
	  a= new Scanner(System.in);
      System.out.println("enter Your Name :");
      String Name = a.nextLine();
}
  public static void empdob() throws ParseException {
	  a= new Scanner(System.in);
	  System.out.println("enter Your Date of Birth in Format dd-MM-yyyy :");
	  
       String Dob = a.nextLine(); 
       SimpleDateFormat bb = new SimpleDateFormat("dd-MM-yyyy");
       java.util.Date d1 = bb.parse(Dob);
       bb.format(d1);
       
}
  public static void empph() {
	  a= new Scanner(System.in);
	  System.out.println("enter Your Phone Number :");
	  try {
		  long number = a.nextLong();
	} catch (Exception e) {
		System.out.println("enter valid phone number  :"+e);
	}  
	}
	  public static void empemail() {
		  a= new Scanner(System.in);
	      System.out.println("enter Your Email ID :");
	      String email = a.nextLine();
}
	  public static void empaddress() {
		  a= new Scanner(System.in);
	      System.out.println("enter Your Address :");
	      String address = a.nextLine();
	}
	  public static void jobdesignation() {
		  a= new Scanner(System.in);
	      System.out.println("enter Your Job Designation   :");
	      job = a.nextLine();

	}
	  public static void fresherOrExprience() {
		  a= new Scanner(System.in);
	      System.out.println("how many years Exprience   :");
	      Integer as = a.nextInt();
	      if (as<=2) {
	    	  ss = as+(as*1280);
		}else if(as<=4){
			ss = as+(as*2080);
		}else if(as<=6) {
			ss = as+(as*2880);
		}else if(as<=8) {
			ss = as+(as*3480);
		}else if(as<=10) {
			ss = as+(as*4080);
		}else if(as<=12) {
			ss = as+(as*5880);
		}else if(as<=14) {
			ss = as+(as*7480);
		}

	}
	  	public static void salary() {
	  		System.out.println("General shift 8 hours.... Enter your working hours");
	  		a = new Scanner(System.in);
	  		int sal = a.nextInt();
	  		HashMap<Integer, Integer> has = new HashMap<>();
	  		has.put(8, 16000);
	  		has.put(9, 17500);
	  		has.put(10, 19000);
	  		has.put(11, 20500);
	  		has.put(12, 22000);
	  		has.put(13, 23500);
	  	   System.out.println("your salay per month is :"+(ss+ has.get(sal)));
	  	   System.out.println("Your role is :"+job);
		}
	  public static void generateEmpId() {
		 int temp;
		 
		  while (true) {
			  int empno = 21230;
			 temp=empno++;
			System.out.println("Your Empolyee number is  :"+empno);
			
			break;
		}	
		}
	  
  public static void main(String[] args) throws ParseException {
	empname();
	empdob();
	empph();
	empaddress();
	jobdesignation();
	fresherOrExprience();
	salary();
	generateEmpId();
	
}
}