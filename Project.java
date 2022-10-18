package sam;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Project {
	static Scanner a;
	static int ss;
	static String job ;
	static int sal;
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
			ss = as+(as*3080);
		}else if(as<=8) {
			ss = as+(as*3880);
		}else if(as<=10) {
			ss = as+(as*5080);
		}else if(as<=12) {
			ss = as+(as*6880);
		}else if(as<=14) {
			ss = as+(as*8480);
		}else if(as<=16) {
			ss = as+(as*12480);
		}

	}
	  	public static void salary() {
	  		System.out.println("General shift 8 hours.... Enter your working hours");
	  		a = new Scanner(System.in);
	  		sal = a.nextInt();
	  		if (sal<=13&&sal>=8) {
	  			HashMap<Integer, Integer> has = new HashMap<Integer, Integer>();
		  		has.put(8, 16000);
		  		has.put(9, 17500);
		  		has.put(10, 19000);
		  		has.put(11, 20500);
		  		has.put(12, 22000);
		  		has.put(13, 23500);
		  		has.put(14, 25500);
		  	   System.out.println("your salay per month is :"+(ss+ has.get(sal)));
		  	   System.out.println("Your role is :"+job);
		  	 int temp;
			 
			  while (true) {
				  int empno = 21230;
				 temp=empno++;
				System.out.println("Your Empolyee number is  :"+empno);
				
				break;
			}	
			} else {
                 System.err.println("Enter valid hours! the work will be 8 hours compulsory");
			}
		}
	 	
		
	  public static void timing() {
		  if (sal==8) {
		  
		  System.out.println("Your working hours  : 9.00 am to  5.00pm");
		  }else if(sal==9) {
			  System.out.println("Your working hours  : 9.00 am to  6.00pm");
		  }else if(sal==10) {
			  System.out.println("Your working hours  : 9.00 am to  7.00pm");
		  }else if(sal==11) {
			  System.out.println("Your working hours  : 9.00 am to  8.00pm");
		  }else if(sal==12) {
			  System.out.println("Your working hours  : 9.00 am to  9.00pm");
		  }else if(sal==13) {
			  System.out.println("Your working hours  : 9.00 am to  10.00pm");
		  }else if(sal==14) {
			  System.out.println("Your working hours  : 9.00 am to  11.00pm");
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

	timing();
	
}
}
