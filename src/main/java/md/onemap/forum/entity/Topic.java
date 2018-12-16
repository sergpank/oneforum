package md.onemap.forum.entity;

import java.util.Date;

public class Topic
{
  private int id;
  private int boardId;
  private int userId;
  private String title;
  private String topicText;
  private Date creationDate;

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public int getBoardId()
  {
    return boardId;
  }

  public void setBoardId(int boardId)
  {
    this.boardId = boardId;
  }

  public int getUserId()
  {
    return userId;
  }

  public void setUserId(int userId)
  {
    this.userId = userId;
  }

  public String getTitle()
  {
    return title;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public String getTopicText()
  {
    return topicText;
  }

  public void setTopicText(String topicText)
  {
    this.topicText = topicText;
  }

  public Date getCreationDate()
  {
    return creationDate;
  }

  public void setCreationDate(Date creationDate)
  {
    this.creationDate = creationDate;
  }
}
