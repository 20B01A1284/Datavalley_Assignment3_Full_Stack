package com.serializattion;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable{  
	 int id;  
	 String name; 
	 String contactNo;
	 String address;
	 public Customer(int id, String name, String contactNo, String address) {  
	  this.id = id;  
	  this.name = name; 
	  this.contactNo = contactNo;
	  this.address = address;
	 }  
}  
public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{    
			  //Creating the object    
			  Customer c1 =new Customer(1, "Teja", "7075608291", "Antharvedipalem");    
			  //Creating stream and writing the object    
			  FileOutputStream fout=new FileOutputStream("JavaObject.txt");    
			  ObjectOutputStream out=new ObjectOutputStream(fout);    
			  out.writeObject(c1);    
			  out.flush();    
			  //closing the stream    
			  out.close();    
			  System.out.println("success");    
			  }catch(Exception e){System.out.println(e);}    
   
	}

}
