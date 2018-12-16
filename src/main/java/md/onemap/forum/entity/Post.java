package md.onemap.forum.entity;

import java.util.Date;

public class Post
{
  private int id;
  private int userId;
  private int topicId;
  private String postText;
  private Date postDate;

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public int getUserId()
  {
    return userId;
  }

  public int getTopicId()
  {
    return topicId;
  }

  public void setTopicId(int topicId)
  {
    this.topicId = topicId;
  }

  public void setUserId(int userId)
  {
    this.userId = userId;
  }

  public String getPostText()
  {
    return postText;
  }

  public void setPostText(String postText)
  {
    this.postText = postText;
  }

  public Date getPostDate()
  {
    return postDate;
  }

  public void setPostDate(Date postDate)
  {
    this.postDate = postDate;
  }
}
