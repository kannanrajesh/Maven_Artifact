package com.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log_BasicConfigurator {
	public static Logger log = Logger.getLogger(Log_BasicConfigurator.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.debug("debug");
		log.info("information");
		log.warn("warning");
		log.error("error");
		log.fatal("fatal message");

	}

}
