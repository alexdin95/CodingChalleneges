package DesignPatterns.Singleton;

public class Logger {
    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
            // creaza un obiect Logger "new Logger();"
            // si il asigneaza logger-ului din clasa "logger"
        }
        return logger;// daca nu e null il returneaza pe cel existent.
    }
}
