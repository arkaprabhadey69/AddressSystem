package com.bl.address;
import java.util.*;

public class AddressBookList {
	
	
	public static HashMap<String,AddressBookMain> addrbooklist;
	
	public AddressBookList()
	{
		addrbooklist= new HashMap<>();
	}
	public void addAddressbook(String name)
	{
		 AddressBookMain a= new AddressBookMain();
		 boolean f=true;
		  while(f)
    	  {
    		
    	    System.out.println("\n1.Add\n2.Edit\n3.Delete\n4.Exit\nEnter your choice : ");
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
    			  
    		  case 4:
    			  System.out.println("Terminated!");
    			  f=false;
    			  break;
    	  
    	    }
    	}  
		  
		  addrbooklist.put(name, a);
		  for (Map.Entry<String,AddressBookMain> entry : addrbooklist.entrySet())
		  	{
			  System.out.println("AddressBookName = " + entry.getKey() + ", Details = " + entry.getValue());
		  	}
	          
		  
		  System.out.println("Added successfully");
   	  
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome to AddressBookManagementSystem");
		AddressBookList adr= new AddressBookList();
		Scanner s6= new Scanner(System.in);
		boolean m=true;
		while(m)
		{
			System.out.println("1.Enter new address book\n2.Exit");
			Scanner s7=new Scanner(System.in);
			int choice=s7.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter address book name: ");
				String addressbookname= s6.nextLine();
				if(addrbooklist.containsKey(addressbookname))
				{
					System.out.println("Error! Name already taken!");
					break;
				}
				adr.addAddressbook(addressbookname);
				break;
			case 2:
				s7.close();
				System.out.println("Exited!");
				m=false;
				break;
				
			}
		}
		
		
	}

}
