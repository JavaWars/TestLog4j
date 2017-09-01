package ua.nure.lazarev;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import ua.nure.lazarev.other.OtherClass;

//need appender for writing to file
//FileAppender
//RollingFileAppender   maximumFileSize maxBackupIndex
//DailyRollingFileAppender

//SimpleLayout =x=> output
//PatternLayout


//BasicConfigurator.configure(); //inside application
//PreperttyConfigurator.configure(); //from property file
//DOMConfigurator.configure();// from xml files

public class Main {

    private static Logger logger=Logger.getLogger(Main.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure ("log4j.properties");

        logger.setLevel(Level.INFO);
        logger.debug("Log4j has been initialized");
        //trace, debug == does not in result log

        logger.trace("trace message");

        logger.debug("debug message");

        logger.info("info message");

        logger.warn("warning message");

        logger.error("error message");

        logger.fatal("fatal message");

        OtherClass.add(1,4);


    }
}
