package com.bl.address;
import java.util.*;

public class AddressBookMain {
	
	ArrayList<Contact> persons;
	Scanner s= new Scanner(System.in);
	 
	
	      public AddressBookMain() 
	      {
	            persons = new ArrayList<Contact>();
	      }
	      public void AddName()
	      {
	    	  //Scanner s= new Scanner(System.in);
	    	  String x,y,z,w,a,b,e;
	    	  String c1;
	    	  System.out.println("Enter your details");
	    	  x=s.nextLine();
	    	  y=s.nextLine();
	    	  z=s.nextLine();
	    	  w=s.nextLine();
	    	  a=s.nextLine();
	    	  b=s.nextLine();
	    	  c1=s.nextLine();
	    	  e=s.nextLine();
	    	  Contact c= new Contact(x,y,z,w,a,b,c1,e);
	    	  persons.add(c);
	    	  System.out.println("Added succesfully");
	    	  for (int i = 0; i < persons.size(); i++)
	    	  { 
	    		   System.out.print(persons.get(i).firstname + " "); 
	          } 
	      }
	      
	      public static void main(String[] args) {
	    	  AddressBookMain a= new AddressBookMain();
	    	  a.AddName();
		}
	      
	 

}
