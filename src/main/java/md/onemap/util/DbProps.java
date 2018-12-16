package md.onemap.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DbProps
{
  private static final Logger log = LogManager.getLogger(DbProps.class.getName());

  private static Properties props;


  private static void init()
  {
    if (props == null)
    {
      log.info("Initializing DB Properties ...");
      props = new Properties();
      try
      {
        props.load(new FileReader("db.properties"));
      }
      catch (IOException e)
      {
        log.error("Unable to load DB properties:", e);
      }
    }
  }

  public static String getDbUrl()
  {
    return getProperty("url");
  }

  public static String getDbLogin()
  {
    return getProperty("login");
  }

  public static String getDbPassword()
  {
    return getProperty("password");
  }

  public static String getDbName()
  {
    return getProperty("name");
  }

  private static String getProperty(String url)
  {
    if (props == null)
    {
      init();
    }
    return props.getProperty(url);
  }
}
