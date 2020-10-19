package com.bl.address;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AddressBookMainTest {
    @Test
    public void given_Contacts_Should_Write_To_A_File(){
        Contact[] c={new Contact("Arka","Dey","lmao","kol","wb","700026","8961377960","abc@gmail.com")};
        ArrayList<Contact> arr=new ArrayList<>();
        arr.add(c[0]);
        AddressBookMain adr= new AddressBookMain();
        adr.writeData(arr);
        System.out.println(adr.countEntries());
        adr.readData(arr);


    }


}