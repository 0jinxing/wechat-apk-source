package com.tencent.wcdb;

public class SQLException extends RuntimeException
{
  public SQLException()
  {
  }

  public SQLException(String paramString)
  {
    super(paramString);
  }

  public SQLException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.SQLException
 * JD-Core Version:    0.6.2
 */