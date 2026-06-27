package com.suma.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise1_LoggingExample {

    private static final Logger logger
            = LoggerFactory.getLogger(Exercise1_LoggingExample.class);

    public static void main(String[] args) {

        logger.info("Application started");

        logger.warn("This is a warning message");

        logger.error("This is an error message");

        logger.info("Application finished");
    }
}
