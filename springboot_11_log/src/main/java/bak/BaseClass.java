package bak;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author malichun
 * @create 2023/01/05 0005 21:57
 */
public class BaseClass {
    private final Class clazz ;
    public static  Logger log;

    public BaseClass(){
        clazz = this.getClass();
        log = LoggerFactory.getLogger(clazz);
    }
}
