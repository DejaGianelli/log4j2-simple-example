package com.drivelab.trace;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTraceLevel {
    private static final Logger logger = LogManager.getLogger(LogTraceLevel.class);

    public static void log() {
        logger.trace("Trace log message");
    }
}