package com.helloworld.impl;

import com.helloworld.interfaces.Printer;

public class PrinterImpl implements Printer {

	private StringBuilder sb = null;

	@Override
	public void set(String s) {
		sb = new StringBuilder(s);
	}

	@Override
	public void execute() {
		System.out.print( sb.toString() );
	}

	/**
	 * @return the sb
	 */
	public StringBuilder getSb() {
		return sb;
	}

	/**
	 * @param sb the sb to set
	 */
	public void setSb(StringBuilder sb) {
		this.sb = sb;
	}

}
