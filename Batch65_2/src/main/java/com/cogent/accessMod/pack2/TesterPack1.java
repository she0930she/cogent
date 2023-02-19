package com.cogent.accessMod.pack2;

import com.cogent.accessMod.pack1.Car; 
// import is used "import" or "include" a library or package/ class
import com.cogent.accessMod.pack1.Vehicle;

public class TesterPack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
		v.show();  // public access
		//v.disp(); // no access to protected
		//v.disp();
		
		System.out.println("******");
		Car c = new Car();
		c.show();
		//c.disp();
		//c.tryMethodProtected();
		
		System.out.println("******");
		Tesla t = new Tesla();
		t.show();

	}

}
