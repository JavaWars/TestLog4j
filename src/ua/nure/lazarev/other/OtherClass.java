package ua.nure.lazarev.other;

import org.apache.log4j.Logger;
/**
 * Created by Pavel on 01.09.2017.
 */
public class OtherClass {

    public static Logger logger=Logger.getLogger(OtherClass.class);

    public static int add(int x,int y){
        logger.trace("add f called");
        int result=x+y;
        logger.debug(result);

        return result;
    }

}
