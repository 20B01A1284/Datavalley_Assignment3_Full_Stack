package com.synchronization;

class PrintingNumbers{  
	 synchronized void printNumbers(int n){//synchronized method  
	   for(int i=1;i<=n;i++){  
	     System.out.println(i);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	  
	 }  
	}  
	  
	class MyThread1 extends Thread{  
	PrintingNumbers pn;  
	MyThread1(PrintingNumbers pn){  
	this.pn=pn;  
	}  
	public void run(){  
	pn.printNumbers(10);  
	}  
	  
	}  
	class MyThread2 extends Thread{  
		PrintingNumbers pn;  
		MyThread2(PrintingNumbers pn){  
		this.pn=pn;  
		}  
		public void run(){  
		pn.printNumbers(5);  
		}  
	}  
	  

public class Synchronization {

	public static void main(String[] args) {
		
		PrintingNumbers obj = new PrintingNumbers();//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  

	}

}
