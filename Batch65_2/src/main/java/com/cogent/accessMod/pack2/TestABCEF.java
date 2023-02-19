package com.cogent.accessMod.pack2;

import com.cogent.accessMod.pack1.A;
import com.cogent.accessMod.pack1.B;

public class TestABCEF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		B b = new B();
		b.accessA();
		
		E e = new E();
		F f = new F();
		e.accessA();
		f.accessF();
		
	}

}
