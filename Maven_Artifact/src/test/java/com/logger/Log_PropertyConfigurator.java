package com.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log_PropertyConfigurator {
	public static Logger log = Logger.getLogger(Log_PropertyConfigurator.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		log.debug("debug");
		log.info("information");
		log.warn("warning");
		log.error("error");
		log.fatal("fatal message");
	}

}
