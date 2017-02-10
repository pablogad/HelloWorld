package com.helloworld.impl;

import com.helloworld.interfaces.Hello;

public class HelloImpl extends PrinterImpl implements Hello  {
	public void set() {
		set( "Hello" );
	}
}
