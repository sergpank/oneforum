package md.onemap;

import md.onemap.util.DbUtil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;

public class MAIN
{
  public static void main(String[] args) throws SQLException
  {
    Logger classLogger = LogManager.getLogger(MAIN.class);
    Logger rootLogger = LogManager.getRootLogger();

    classLogger.trace("class log message");
    classLogger.debug("class log message");
    classLogger.info("class log message");
    classLogger.warn("class log message");
    classLogger.error("class log message");

    rootLogger.trace("root log message");
    rootLogger.debug("root log message");
    rootLogger.info("root log message");
    rootLogger.warn("root log message");
    rootLogger.error("root log message");

    System.out.println(new File("lala").getAbsolutePath());

    Connection connection = DbUtil.getConnection();

    System.out.println(connection.getClientInfo());
    System.out.println(connection.getMetaData());
  }
}
