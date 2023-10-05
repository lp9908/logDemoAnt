package com.caiman.test;

import org.apache.log4j.Logger;

public class LogDemoAnt {

	final static Logger logger = Logger.getLogger(LogDemoAnt.class);
	
	public static void main(String[] args) {
		logger.warn("Warning");
		logger.error("Error");
		logger.fatal("Fatal stuff");
	}

}
