import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Clase1 {

    private static final Logger LOGGER = LogManager.getLogger(Clase1.class);

    public static void main(String[] args) 
    {
        //No va a funcionar a no ser que sea una app de escritorio
        LOGGER.trace("Log level trace");
        LOGGER.debug("Log level debug");
        LOGGER.info("Log level info");
        LOGGER.warn("Log level warn");
        LOGGER.error("Log level error");
        LOGGER.fatal("Log level fatal");
    }
}