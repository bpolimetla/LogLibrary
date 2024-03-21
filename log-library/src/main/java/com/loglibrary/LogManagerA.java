package com.loglibrary;

import org.apache.logging.log4j.LogManager;

public class LogManagerA extends LogManager{

	public static LoggerA getLoggerA(String clazz)
	{
		LoggerA la = new LoggerA();
		return la;
	}
}
