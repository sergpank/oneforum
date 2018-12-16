package md.onemap.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil
{
  private static final Logger log = LogManager.getLogger(DbUtil.class.getName());

  private static Connection con;

  public static Connection getConnection()
  {
    if (con == null)
    {
      init();
    }
    return con;
  }

  private static void init()
  {
    try
    {
      log.info("Initializing DB connection ...");
      String url = DbProps.getDbUrl() + DbProps.getDbName();
      con = DriverManager.getConnection(url, DbProps.getDbLogin(), DbProps.getDbPassword());
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
  }
}
