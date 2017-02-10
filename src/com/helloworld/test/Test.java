package com.helloworld.test;

import com.helloworld.impl.HelloImpl;
import com.helloworld.impl.PrinterImpl;
import com.helloworld.impl.WorldImpl;

public class Test {

	public static void main(String[] args) {
		WorldImpl w = new WorldImpl();
		HelloImpl h = new HelloImpl();
		w.set();
		h.set();
		PrinterImpl o = new PrinterImpl();
		h.execute();
		o.set(" ");
		o.execute();
		w.execute();
		o.set("\n");
		o.execute();
	}

}
