package designPrinciples;
import java.util.logging.Level;
import java.util.logging.Logger;
interface Logs{
	void handleError(Exception exception);
	void handleError(String exception);
}
class Log{
	public static void handleError(Exception exception)
    {
    	Logger logger = Logger.getAnonymousLogger();
		logger.log(Level.SEVERE, "a file exception was thrown", exception);
    }
}
class fileLogs implements Logs
{
    public void handleError(Exception exception)
    {
    	Logger logger = Logger.getAnonymousLogger();
		logger.log(Level.SEVERE, "a file exception was thrown", exception);
    }
    public void handleError(String exception)
    {
    	Logger logger = Logger.getAnonymousLogger();
		logger.log(Level.SEVERE, "an email exception was thrown", exception);
    }
}
class emailLogs implements Logs
{
    public void handleError(Exception exception)
    {
    	Logger logger = Logger.getAnonymousLogger();
		logger.log(Level.SEVERE, "an email exception was thrown", exception);
    }
    public void handleError(String exception)
    {
    	Logger logger = Logger.getAnonymousLogger();
		logger.log(Level.SEVERE, "an email exception was thrown", exception);
    }
}
