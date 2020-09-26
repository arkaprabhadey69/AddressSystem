package com.bl.address;
import java.util.*;

public class AddressBookMain {
	
	public static ArrayList<Contact> persons;
	
	
	 Scanner s= new Scanner(System.in);
	 Scanner s1= new Scanner(System.in);
	 Scanner s2= new Scanner(System.in);
	      public AddressBookMain() 
	      {
	            persons = new ArrayList<Contact>();    //Constructor
	      }
	      
	      
	      public static Contact Findname(String name)
	      {
	    	  Contact d=new Contact();
	    	  
	    	  for(int i=0;i<persons.size();i++)
	    	  {
	    		  Contact c= (Contact)persons.get(i);
	    		  
	    		  if(name.equals(c.firstname))
	    		  {
	    			   d=c;
	    		  }
	    		  
	    	  }
	    	  System.out.println("\n"+d.firstname+" "+d.lastname+" "+d.address+" "+d.city+" "+d.email+" "+d.zip+"\n");
	    	  
			return d;
	    	  
	      }
	      public void AddName()
	      {
	    	  String x,y,z,w,a,b,e;
	    	  String c1;
	    	  System.out.println("Enter your details\n");
	    	  System.out.println("Firstname\n");
	    	  x=s2.nextLine();
	    	  System.out.println("Lastname\n");
	    	  y=s2.nextLine();
	    	  System.out.println("Address\n");
	    	  z=s2.nextLine();
	    	  System.out.println("City\n");
	    	  w=s2.nextLine();
	    	  System.out.println("State\n");
	    	  a=s2.nextLine();
	    	  System.out.println("Zip\n");
	    	  b=s2.nextLine();
	    	  System.out.println("Phone No.\n");
	    	  c1=s2.nextLine();
	    	  System.out.println("Email\n");
	    	  e=s2.nextLine();
	    	  Contact c= new Contact(x,y,z,w,a,b,c1,e);
	    	  System.out.println("First name "+c.firstname+"\n");
	    	  persons.add(c);
	    	  System.out.println("Added succesfully, the Contacts are\n");
	    	  for (int i = 0; i < persons.size(); i++)
	    	  { 
	    		  persons.get(i).Display();
	          } 
	    	 
	      }
	      public void edit(String name)
	      { 
	    	  System.out.println("\nIn the Edit Method \n");
	    	  Contact c=Findname(name);
	    	  System.out.println("Enter Choice to edit\n\n\n1.FirstName\n2.Secondname\n3.Address\n4.City\n5.State\n6.Zip\n7.Phone\n8.Email\n");
	    	  int choice=s.nextInt();
	    	  switch(choice)
	    	  {
	    	  case 1:
	    		  System.out.println("Enter new name: \n");
	    		  c.firstname=s1.nextLine();
	    		  for (int i = 0; i < persons.size(); i++)
	    		  { 
	    		  persons.get(i).Display(); 
	    		  } 
	    		  break;
	    	  case 2:
	    		  System.out.println("Enter last name: \n");
	    		  //String y=s1.nextLine();
	    		  //Contact c1=Findname(name);
	    		  c.lastname=s1.nextLine();
	    		  for (int i = 0; i < persons.size(); i++)
	    		  { 
	    			  persons.get(i).Display();
	    		  } 
	    		  break;
	    	  case 3:
	    		  System.out.println("Enter new address:");
	    		  //String y1=s1.nextLine();
	    		  //Contact c2=Findname(name);
	    		  c.address=s1.nextLine();
	    		  for (int i = 0; i < persons.size(); i++)
	    		  { 
	    			  persons.get(i).Display();
	    		  } 
	    		  break;
	    	  case 4:
	    		  System.out.println("Enter new city:");
	    		  //String y2=s1.nextLine();
	    		  //Contact c3=Findname(name);
	    		  c.city=s1.nextLine();
	    		  for (int i = 0; i < persons.size(); i++)
	    		  { 
	    			  persons.get(i).Display();
	    		  } 
	    		  break;
	    	  case 5:
	    		  System.out.println("Enter new state:");
	    		  //String y3=s1.nextLine();
	    		  //Contact c4=Findname(name);
	    		  c.state=s1.nextLine();
	    		  for (int i = 0; i < persons.size(); i++)
	    		  { 
	    			  persons.get(i).Display(); 
	    		  } 
	    		  break;
	    	  case 6:
	    		  System.out.println("Enter new zip:");
	    		  //String y4=s1.nextLine();
	    		  //Contact c5=Findname(name);
	    		  c.zip=s1.nextLine();
	    		  for (int i = 0; i < persons.size(); i++)
	    		  { 
	    			  persons.get(i).Display();
	    		  } 
	    		  break;
	    	  case 7:
	    		  System.out.println("Enter new number:");
	    		  //String y5=s1.nextLine();
	    		  //Contact c6=Findname(name);
	    		  c.number=s1.nextLine();
	    		  for (int i = 0; i < persons.size(); i++)
	    		  { 
	    			  persons.get(i).Display();
	    		  } 
	    		  break;
	    	  case 8:
	    		  System.out.println("Enter new email:");
	    		  //String y6=s1.nextLine();
	    		  //Contact c7=Findname(name);
	    		  c.email=s1.nextLine();
	    		  for (int i = 0; i < persons.size(); i++)
	    		  { 
	    			  persons.get(i).Display();
	    		  } 
	    		  break;
	    	  default:
	    		  break;
	    			  
	    	  
	    	  }
	    	  
	    	  
	      }
	      
	      public void delete(String name)
	      {
	    	  for(int i=0;i<persons.size();i++)
	    	  {
	    	  
    		  Contact c= (Contact)persons.get(i);
    		  if(name.equals(c.firstname))
    		  {
    			  persons.remove(i);
    		  }
	    	  }
	    	  for (int i = 0; i < persons.size(); i++) { 
	    		  System.out.println("After Deletion");
	    		  persons.get(i).Display(); 
	          } 
    		  
	    	  
	      }
	      
	      public static void main(String[] args) {
	    	  
	    	  AddressBookMain a= new AddressBookMain();
	    	  boolean f=true;
	    	  
	    	  while(f)
	    	  {
	    		
	    	    System.out.println("\n1.Add\n2.Edit\n3.Delete\nEnter your choice : ");
	    	    Scanner in = new Scanner(System.in);
	    	    int ch = in.nextInt();
	    	 
	    	    switch(ch)
	    	    {
	    		  case 1:
	    			  a.AddName();
	    			  break;
	    			  
	    		  case 2:
	    			  System.out.println("Enter name to edit");
	    			  Scanner s1=new Scanner(System.in);
	    			  String a1= s1.nextLine();
	    			  a.edit(a1);
	    			  break;
	    			  
	    		  case 3:
	    		  	  System.out.println("Enter name to delete");
	    			  Scanner s2=new Scanner(System.in);
	    			  String a2=s2.nextLine();
	    			  a.delete(a2);
	    			  break;
	    			  
	    		  default:
	    			  System.out.println("Terminated!");
	    			  in.close();
	    			  f=false;
	    	  
	    	    }
	    	}  
	    	  
		}
	      
	 

}
