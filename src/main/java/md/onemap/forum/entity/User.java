package md.onemap.forum.entity;

import java.util.Date;

public class User
{
  private int id;
  private String login;
  private String password;
  private String email;
  private Date registrationDate;

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String getLogin()
  {
    return login;
  }

  public void setLogin(String login)
  {
    this.login = login;
  }

  public String getPassword()
  {
    return password;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }

  public String getEmail()
  {
    return email;
  }

  public void setEmail(String email)
  {
    this.email = email;
  }

  public Date getRegistrationDate()
  {
    return registrationDate;
  }

  public void setRegistrationDate(Date registrationDate)
  {
    this.registrationDate = registrationDate;
  }
}
