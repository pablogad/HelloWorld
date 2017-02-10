package com.helloworld.impl;

import com.helloworld.interfaces.World;

public class WorldImpl extends PrinterImpl implements World {

	public void set() {
		set( "world!" );
	}

}
